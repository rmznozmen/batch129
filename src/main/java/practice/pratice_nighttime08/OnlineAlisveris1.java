package practice.pratice_nighttime08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OnlineAlisveris1 {

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamodeme;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


      urunListesi.add("ayakkabi:urun kodu:1");
      urunListesi.add("canta:urun kodu:2");
      urunListesi.add("saat:urun kodu:3");
      urunListesi.add("bilezik:urun kodu:4");
      urunListesi.add("toka:urun kodu:5");

      urunFiyatlari.add(10.0);
      urunFiyatlari.add(20.0);
      urunFiyatlari.add(30.0);
      urunFiyatlari.add(15.0);
      urunFiyatlari.add(60.0);

        System.out.println("urun Fiyatlari="+urunFiyatlari);
        System.out.println("urun Listesi="+urunListesi);

        musteriSecim();














    }//main

    private static void musteriSecim() {
        System.out.println("Lutfen sectiginiz urunun kodunu giriniz");
        int secim=input.nextInt();
        System.out.println("Kac aded alacaksiniz");
        int adet=input.nextInt();

        double urunTutar=adet*urunFiyatlari.get(secim-1);

        toplamodeme+=urunTutar;
        System.out.println("Alisverise devam ise 1:\n Odeme isin 2:basin");
        int devamMi=input.nextInt();
        if(devamMi==1){
            musteriSecim();
        }else{
            odeme();

        }

    }//musteri secimi

    private static void odeme() {
        LocalDate kurulusGunu=LocalDate.of(2023,01,10);
        LocalDate date=LocalDate.now();

        if(date.isEqual(kurulusGunu)){
            System.out.println("Acilis gunu odenecek miktar 0");
        }


    }//odeme
}//class
