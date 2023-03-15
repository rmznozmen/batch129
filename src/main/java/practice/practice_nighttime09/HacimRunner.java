package practice.practice_nighttime09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner {

    public static void main(String[] args) {

        KaraPrizma karaPrizma=new KaraPrizma();

        double karePrizmaHacmi=karaPrizma.hacimHesapla(5,6);
        System.out.println("karePrizmaHacmi="+karePrizmaHacmi);//150;


        NumberFormat obj=new DecimalFormat(".00");//.sonra 2 sifir

        Koni koni=new Koni();

        double koniHacmi=koni.hacimHesapla(3,5);
        System.out.println("KoniHacmi="+obj.format(koniHacmi));

        // NumberFormat classindan bir obje olusturup DecimalFormat(".00")yazdigimizda virgulden
        //sonra iki basamak yazdirir.
        // NumberFormat classindan bir obje olusturup DecimalFormat(".000")yazdigimizda virgulden
        //        //sonra uc basamak yazdirir.


        Silindir silindir=new Silindir();
        double silindirHacmi=silindir.hacimHesapla(1,5);
        System.out.println("SilindirinHacmi="+obj.format(silindirHacmi));





}
}