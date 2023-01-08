package day08nestedifternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nested03test {
    public static void main(String[] args) {
         /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Alemci ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen Bir Sifre Girinz");
        String psw=input.nextLine();
        char firstCh=psw.charAt(0);

        if(firstCh>='A'&& firstCh<='Z'){
            if(firstCh=='A'){
                System.out.println("gecerli password");
            }else{
                System.out.println("Buyuk harf degil");
            }

        }else if(firstCh>='a'&& firstCh<='z'){
             if(firstCh=='z'){
                System.out.println("gecersiz psw");
            }
        }else{
            System.out.println("kucuk harf degil");
        }

    }
}
