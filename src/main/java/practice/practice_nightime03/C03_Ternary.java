package practice.practice_nightime03;

import java.util.Scanner;

public class C03_Ternary {
  /*
    Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
    Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
    3 basamakli degilse cift olup olmadigini kontrol edin
    Cift ise "3 basamakli olmayan cift sayi" yazdirin
    Cift degilse " 3 basamakli olmayan tek sayi" yazdirin
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();

        System.out.println("********* if ile cozumu***************");

        boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;
        if (sayi > 0) {

            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli sayi ");
            } else if (sifirdanBuyukUcBasOlmayanCift) {
                System.out.println("3 basamakli olmayan pozitif cift sayi ");
            } else
                System.out.println("3 basamakli olmayan pozitif tek sayi");
        } else {//negatif sayilar icin burasi calisr
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }//if body

        System.out.println("*** Ternary **************");
        boolean pozitifseTernary=sayi>0;
        boolean sifirdanBuyukUcBasTernary = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasDegilCiftTernary = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;
 /*   ActionDataType variable=(şart)        ? trueAction                                        : falseAction;
        Data   variable=    sartim          ?  Dogruysa                                       :  Yanlissa;
        Type
*/
        String  sonuc  = (pozitifseTernary) ?(sifirdanBuyukUcBasTernary) ? ("3 basamaklı sayi") ://0'dan buyuk 3 basamakli ise incelendi
                (sifirdanBuyukUcBasDegilCiftTernary ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı ") :     //0'dan buyuk 3 basamakli degilse incelendi
                ("Lutfen Sifirdan buyuk pozitif bir tamsayi giriniz");//0'dan kucuk olma durumu incelendi

        System.out.println(sonuc);
    }//main
}//class