package ArrayTekrar21day;

public class C01 {

    public static void main(String[] args) {
        /// verilen bir int arraydeki en buyuk sayiyi yazdiran bir method olusturun


        int [] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);


    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];

        for (int i = 1; i <sayilar.length ; i++) {

            if (sayilar[i]>maxSayi){

                maxSayi=sayilar[i];

            }

        }

        System.out.println("Arraydeki en buyuk sayi : " + maxSayi);

    }


//arrays
 













}
