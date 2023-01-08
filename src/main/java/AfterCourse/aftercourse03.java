package AfterCourse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class aftercourse03 {
    public static void main(String[] args) {
        //2.  kullanicidan adresini aliniz ve ekrana yazdiriniz
        //3Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Adresiniz Giriniz...");
        String adres=input.nextLine();

       System.out.println("Kullanincinin Adresi="+adres);

        System.out.println("Lutfen ilk sayinizi giriniz");
        int ilkSayi=input.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi=input.nextInt();


        System.out.println(ilkSayi+ikinciSayi);
        System.out.println(ilkSayi-ikinciSayi);
        System.out.println(ilkSayi*ikinciSayi);
        System.out.println(ilkSayi/ikinciSayi);

    }
}
