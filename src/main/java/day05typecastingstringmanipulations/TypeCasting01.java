package day05typecastingstringmanipulations;

public class TypeCasting01 {
 /*
    Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denir.
    Numeric Date Type'lar byte-short-int-long-float-double

    Note1:Kucuk data Type'lari buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
          Bu isleme "AutoWidening"denir.

    Note3:Buyuk data type'lerini kucuk data type'lerine cevirmek riskli bir istir.Java bu riskli isi otomatik olarak yapmaz.
          Bu islemi kod yazanlar yapar.
          Bu isleme "ExplicitNarrowing"(aciktan daraltma) denir.


  */

    public static void main(String[] args) {

        //byte data type'ini data type'ni ceviriniz.

        byte age=13;
        int ageInt=age;

        //Long data type'ni shorta data cevirelim.

        long weight=234;
        short weightShort=(short)weight;

        //int data type ni float data type ni cevirin.

        int alan=52000;
        System.out.println(alan);
        float alanFloat=alan;
        System.out.println(alanFloat);

        // double data typeni short data typeni ceviriniz.

        double number=12.934;
        System.out.println(number);
        short numberShort=(short)number;
        System.out.println(numberShort);

        //Dikkat:
        //Donusum yaptiginiz sayi(260),donuseceginiz data type'nin sinirlari disinda ise ,Java kullandiginiz sayi ile "mod"islemi
        // yapar ve mod isleminin sonucu sizin yeni degeriniz olur.
        //examlpe1:
        short num=260;
        System.out.println(num);
        byte numByte=(byte)num;
        System.out.println(numByte);
        // Example 2:
        short n=1023;
        System.out.println(n);
        byte nByte=(byte)n;
        System.out.println(nByte);






    }
}
