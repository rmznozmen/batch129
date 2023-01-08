package practice_nighttime02;

import java.util.Scanner;

public class C0_01ScannerTest {

    /*

    TechProEd spor salonu icin kullanicidan isim; soyisim; yas;
    kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
    olarak toplam ucreti yazdiriniz

     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("TechPro Spor Salonuna Hos Geldiniz");

        System.out.println("Lutfen adinizi ve soyadinizi giriniz....");
        String adSoyadi=input.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        byte age=input.nextByte();

        System.out.println("Lutfen kilonzu giriniz..");
        double kilo=input.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz..");
        double boy=input.nextDouble();

        int aylikUcret=20;
        System.out.println("Aylik Kurs Ucreti="+aylikUcret+"$");


        System.out.println("Kursa Geleceginiz sureyi giriniz..");
        int kursSuresi=input.nextInt();


        int toplamUcret=aylikUcret*kursSuresi;
        System.out.println("Toplam Odeyeceginiz Ucreti="+toplamUcret);

        System.out.println("Adi Soyadi="+adSoyadi+"\nYas="+age+"\nKilonuz ="+kilo+"\n Boy="+boy
        +"\naylik ucret="+aylikUcret+"\nKurs Suresi="+kursSuresi+"\nToplam odemeniz Gereken ="+toplamUcret+"$");

        System.out.println("ILGINIZE TESEKKUR EDERIZ");








    }

    }

