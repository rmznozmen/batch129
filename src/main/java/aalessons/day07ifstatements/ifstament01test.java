package aalessons.day07ifstatements;

import java.util.Scanner;

public class ifstament01test {

    public static void main(String[] args) {
        //Example 1) Verilen character buyuk harf ise ekrana “Buyuk Harf” yazdiran
        //           kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir Harf Giriniz ");
       char ch= input.next().charAt(0);

       if(ch>='A' && ch<='Z'){
           System.out.println("Sen buyuk Harfsin");
       }
       if(ch>='a' && ch<='z'){
           System.out.println("sen kucuk harfsin");
       }
       //2YOL
        System.out.println("lutfen bir harf Guriniz");
       char ch1 =input.next().charAt(0);

       if(ch1>='A' && ch1<='Z'){
           System.out.println("sen buyuk harfsin");
       }else if(ch1>='a' && ch1<='z'){
           System.out.println("sen kucuksiun");
       }else{
           System.out.println("sen hicbirseysin");
       }


        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        System.out.println("Lutfen bir sayi giriniz");
       int num=input.nextInt();
       if(num%2==0){
           System.out.println("cift sayi");
       }
       if(num%2!=0){
           System.out.println("tek sayi ");
       }

       //2yol

        System.out.println("Lutfen bir sayi giriniz ");
     int num2=input.nextInt();

     if(num2%2==0){
         System.out.println("cirft sayisin");
     }else if(num2%2!=0){
            System.out.println("tek sayi");
        }else{
            System.out.println("sayi degilsin");
        }

    }
}

