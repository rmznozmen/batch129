package aalessons.day03scanner;

import java.util.Scanner;

public class DENEME {
    public static void main(String[] args) {
        ////Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz/

        Scanner input=new Scanner(System.in);
        System.out.println("Isminiz Giriniz...");
        String firstName=input.nextLine();
        System.out.println("Soyisminizi Giriniz..");
        String surName=input.nextLine();
        System.out.println(firstName + surName);

       // //Kullanicidan adresini aliniz ve ekrana yazdiriniz.

        Scanner input2=new Scanner(System.in);
        System.out.println("Lutfen Adresinizi Giriniz...");
        String addres=input2.nextLine();
        System.out.println("adresinizz"+addres);
      //Kullanicidan adresini aliniz ve ekrana yazdiriniz.






    }
}
