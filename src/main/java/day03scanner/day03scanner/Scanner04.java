package day03scanner.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yazdiriniz.

        Scanner input=new Scanner(System.in);
        System.out.println("iki sayi giriniz..");
        double firstNumber=input.nextDouble();
        double secondNumber=input.nextDouble();
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);

        Scanner input2=new Scanner(System.in);
        System.out.println("iki sayi giriniz..");
        double firstNumber1=input.nextDouble();
        double secondNumber1=input.nextDouble();
        System.out.println("Total"+(firstNumber1+secondNumber1));
        System.out.println("Remavol"+(firstNumber1-secondNumber1));
        System.out.println("Multiply"+(firstNumber1*secondNumber1));
        System.out.println("Divided"+(firstNumber1/secondNumber1));


    }
}
