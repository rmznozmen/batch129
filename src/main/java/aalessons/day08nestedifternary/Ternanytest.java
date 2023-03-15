package aalessons.day08nestedifternary;

import java.util.Scanner;

public class Ternanytest {
    public static void main(String[] args) {
        //Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double a=input.nextDouble();
        double b=input.nextDouble();

        if(a<b){
            System.out.println("kucuk Sayi ="+ a);
        }else{
            System.out.println(b);
        }
        //2.yol ile

        double result=a<b?a:b;
        System.out.println(result);
    }
}
