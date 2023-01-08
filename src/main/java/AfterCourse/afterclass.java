package AfterCourse;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class afterclass {
    public static void main(String[] args) {
        //Example 4: S Stringindeki 2. ve sondan ikinci karakteri aliniz ve ekrana yanyana yazdiriniz. Tek bir karakter alinacaksa charat kullan
        //Example5: "s" Stringinde kullanilan  character sayisini bulunuz.

        String r = "Ramazan ozmen";

        char ikinciKarakter = r.charAt(r.length() - 2);//m
        char sonIkinciKarakter = r.charAt(11);//e
        //1.yol
        System.out.print(ikinciKarakter);
        System.out.println(sonIkinciKarakter);//me
        //2.yol
        System.out.println("" + ikinciKarakter + sonIkinciKarakter);//me

        int KarakterSayisi = r.length();
        System.out.println(KarakterSayisi);//13

        String gomlek = "520";
        String ayakkabi = "500";
        int sum = Integer.valueOf(gomlek) + Integer.valueOf(ayakkabi);
        System.out.println(sum);

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi Giriniz");
        String a = input.nextLine();



    }

}




