package day03scanner.day03scanner;

import javax.sound.midi.spi.SoundbankReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner04test {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yazdiriniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter First Number...");
        double firstNumber=input.nextDouble();
        double secondNumber=input.nextDouble();
        System.out.println("ADD"+(firstNumber+secondNumber));
        System.out.println("CIKARMA"+(firstNumber-secondNumber));
        System.out.println("Multiply"+(firstNumber*secondNumber));
        System.out.println("Divided"+(firstNumber/secondNumber));


    }


    }
