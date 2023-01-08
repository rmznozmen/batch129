package day08nestedifternary;

import java.util.Scanner;

public class Nested01test {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan 3 tane sayi aliniz.
                     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                     Eger ucgen ise “eskenar”
                     Ucgen olma durumunu
                     kontrol ediniz.
                     INFO :
                     Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                       herhangi iki kenar farki ucuncu kenardan kucuk olmali
                     a+b>c>a-b
                     a+c>b>a-c
                     b+c>a>b-c
                     a=b=c ise eskenar ucgen

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgen Kenalar icin 3 tane sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = ((a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c)));

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ucgen Kenarlari Negatif Olamaz");

        } else if (ucgenmi) {

            if ((a == b && b == c && a == c)) {
                System.out.println("sen ucgensin hemde eskenar");

            } else {
                System.out.println(" ucgen  ama eskenar degilsin");
            }
        } else {
            System.out.println("ucgen degilsn");


        }

    }
}


