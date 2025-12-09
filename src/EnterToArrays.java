import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EnterToArrays {

    int[] array;// dizimi sadece deklare ettim.

    Random randomSayiUretici = new Random();// Random classından oluşturduğum nesne

    Scanner input = new Scanner(System.in);

    public void rastgeleDiziElemaniOlusturma() {
        System.out.print("Kaç Elemanlı bir dizi istersiniz?");
        int elemanSayisi = input.nextInt();
        array=new int[elemanSayisi];//kullanıcının girdiği değer kadar elemanı olan bir dizi oluştruduk.
        for (int i = 0; i < array.length; i++) {//dizideki tüm indexlere uğrayıp rastgele üretilmiş değerleri atıyor.
            int randomSayi = randomSayiUretici.nextInt(elemanSayisi);
            array[i] = randomSayi;
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

            int randomSayi = randomSayiUretici.nextInt(i + 1);// burada 0'dan (i+1).sayıya kadar rastgele sayı üretsin
                                                              // komutunu verdim.
            System.out.println();
            // System.out.println(" 0 1 2 3 4 5");
            System.out.println(Arrays.toString(array));// her değişimden önce görmek istedğimden yazdırdım
            int temp = array[i];// burada da klasik bir değişken değiştirme algoritması var
            array[i] = array[randomSayi];
            array[randomSayi] = temp;

        }
    }

    public static void main(String[] args) {

        EnterToArrays enterToArrays = new EnterToArrays();//class'ın nesnesini üretip hem class'taki verilere hem de oradaki metotlara ulaşıyoruz.
        
        enterToArrays.rastgeleDiziElemaniOlusturma();

        System.out.println("öncesi: " + Arrays.toString(enterToArrays.array));

        enterToArrays.shuffle();

        System.out.println("Sonrası: " + Arrays.toString(enterToArrays.array));

        enterToArrays.input.close();
    }

}
