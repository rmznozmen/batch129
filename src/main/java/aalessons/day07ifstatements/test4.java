package aalessons.day07ifstatements;

import java.util.Scanner;

public class test4 {
    /*
    Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
    asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
    Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int age=input.nextInt();

        if(age<=0){
            System.out.println("hatali yas girdiniz");
        }else if(age<5){
            System.out.println("Bebek");
        }else if(age<13){
            System.out.println("cocuk");
        }else if(age<21){
            System.out.println("gemc");
        }else if(age<31){
            System.out.println("yetiskin");
        }else{
            System.out.println("tanimlanmamis yas");
        }
    }
}
