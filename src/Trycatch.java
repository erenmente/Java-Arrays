import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için aracımızı oluşturduk.
        Scanner input = new Scanner(System.in);

        // 3 kişilik bir not defteri (dizi) oluşturduk.
        double[] sayilar = new double[3];

        System.out.println("Lütfen " + sayilar.length + " adet sayı giriniz:");

        // Döngümüz başlıyor. i = 0, 1, 2 olacak.
        for (int i = 0; i < sayilar.length; i++) {

            // --- GÜVENLİK BÖLGESİ BAŞLANGICI (TRY) ---
            try {
                System.out.print((i + 1) + ". Sayı: ");

                // RİSKLİ HAREKET: Kullanıcıdan sayı istiyoruz.
                // Eğer harf girerse burada kod 'hata fırlatır' ve hemen catch'e atlar.
                sayilar[i] = input.nextDouble();

            } catch (Exception e) {
                // --- GÜVENLİK AĞI (CATCH) ---
                // Hata olduğunda program çökmez, burası çalışır.

                System.out.println("HATA: Lütfen sadece sayısal değer girin! (Harf girmeyin)");

                // KRİTİK ADIM 1: Çöplüğü Temizlemek
                // Scanner'ın hafızasında kalan o hatalı harfi (örn: "a") yutup yok ediyoruz.
                // Bunu yapmazsak sonsuz döngüye girer.
                input.next();

                // KRİTİK ADIM 2: Hakkı Geri Vermek
                // Kullanıcı hatalı girdiği için bu turu (i) saymıyoruz.
                // i'yi bir azaltıyoruz ki döngü başa döndüğünde aynı sırayı tekrar sorsun.
                i--;
            }
            // --- GÜVENLİK BÖLGESİ BİTİŞİ ---
        }
        input.close();
        // Sonucu görelim
        System.out.println("\n--- GİRİLEN SAYILAR ---");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i + ". İndeks: " + sayilar[i]);
        }

    }
}