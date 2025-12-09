import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EnterToArrays {

    int[] array;// dizimi sadece deklare ettim.

    Random randomSayiUretici = new Random();// Random classından oluşturduğum nesne

    Scanner input = new Scanner(System.in);

    public void siralama() {
        for (int i = 0; i < array.length; i++) {// bu dış döngü iç döngü eleman sayısı kadar olduğundan bütün syaılar
                                                // büyükten küçüğe sıralanıyor
            for (int j = 0; j < array.length - 1 - i; j++) {// bu iç döngü en büyük sayıyı bulup sona atıyor
                if (array[j] > array[j + 1]) {
                    int temp = array[j];// burada değişken değiştirme kullanılıyor
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));// burada da en son büyükten küçüğe görmek için yazdırıyorum.
    }

    public void rastgeleDiziElemaniOlusturma(int elemanSayisi) {

        array = new int[elemanSayisi];// kullanıcının girdiği değer kadar elemanı olan bir dizi oluştruduk.
        for (int i = 0; i < array.length; i++) {// dizideki tüm indexlere uğrayıp rastgele üretilmiş değerleri
                                                // atıyor.
            int randomSayi = randomSayiUretici.nextInt(elemanSayisi);/*
                                                                      * random class'ı çağırıldığında default
                                                                      * değer aralığında (0 ile 1) arasında
                                                                      * değer üretiyor ama asla 1 olmyuor
                                                                      * (maks:0.99...9)
                                                                      * eleman sayısı ile çarptığımızda virgüllü
                                                                      * bir sayı çıkar ancak int değer olarak
                                                                      * ürettiğimizden virgüllü kısım atılıyor
                                                                      * kısaca 0 ile eleman sayısının 1 eksiği
                                                                      * arasında değerler geliyor.
                                                                      */
            array[i] = randomSayi;// random olarak üretilen sayı

        }

    }

    public void shuffle() {
        for (int i = array.length - 1; i > 0; i--) {/*
                                                     * algoritmanın mantığı gereği dizinin sonuncu indexinden başlamam
                                                     * gerek.
                                                     * dizi uzunluğundan 1 çıkarınca dizinin sonuncu indexini
                                                     * buluyorum. Kısaca döngüye diyorum ki i sonuncu indexten 0.indexe
                                                     * birer birer azalarak gitsin
                                                     */

            int randomSayi = randomSayiUretici.nextInt(i + 1);/*
                                                               * random class'ı çağırıldığında default
                                                               * değer aralığında (0 ile 1) arasında
                                                               * değer üretiyor ama asla 1 olmuyor
                                                               * (maks:0.99...9)
                                                               * eleman sayısı ile çarptığımızda virgüllü
                                                               * bir sayı çıkar ancak int değer olarak
                                                               * ürettiğimizden virgüllü kısım atılıyor
                                                               * kısaca 0 ile eleman sayısının 1 eksiği (sonuncu index
                                                               * kadar)
                                                               * arasında değerler geliyor.
                                                               */
            System.out.println();
            // System.out.println(" 0 1 2 3 4 5");
            System.out.println(Arrays.toString(array));// her değişimden önce görmek istedğimden yazdırdım
            int temp = array[i];// burada da klasik bir değişken değiştirme algoritması var
            array[i] = array[randomSayi];
            array[randomSayi] = temp;

        }
    }

    public static void main(String[] args) {

        EnterToArrays enterToArrays = new EnterToArrays();// class'ın nesnesini üretip hem class'taki verilere hem de
                                                          // oradaki metotlara ulaşıyoruz.
        while (true) {
            System.out.print("Kaç Elemanlı bir dizi istersiniz? ");
            if (enterToArrays.input.hasNextInt()) {// kullanıcıdan alınan değerin sayısal bir değer olup olmadığını
                                                   // kontrol
                                                   // ediyor.
                int elemanSayisi = enterToArrays.input.nextInt();
                if (elemanSayisi <= 0) {
                    System.out.println("Negatif bir değer giremezsiniz.");
                    continue;
                } else {
                    enterToArrays.rastgeleDiziElemaniOlusturma(elemanSayisi);
                    break;
                }
            } else {
                System.out.println("Lütfen sayısal bir değer girin.");
                enterToArrays.input.next();
                continue;
            }
        }
        System.out.println("öncesi: " + Arrays.toString(enterToArrays.array));

        enterToArrays.shuffle();

        System.out.println();

        System.out.println("Sonrası(Shuffle): " + Arrays.toString(enterToArrays.array));

        System.out.print("Sıralama Sonrası(Buble Sort): ");
        enterToArrays.siralama();

        enterToArrays.input.close();
    }

}
