package day07ifstatements;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
       int day= input.nextInt();
       if(day==1){
           System.out.println("Haftanin"+day+"."+"gunu"+"Sunday"+"dir");
       }
       if(day==2){
           System.out.println("Haftanin"+day+"."+"+"+"Monday"+"dir");
       }
       if(day==3){
           System.out.println("Haftanin"+day+"."+"Tuesday"+"dir");
       }
       if(day==4){
           System.out.println("Haftanin"+day+"."+"Wendesday"+"dir");
       }
       if(day==5){
           System.out.println("Haftanin"+day+"."+"Thirsday"+"dir");
       }
       if(day==6){
           System.out.println("Haftanin"+day+"."+"Friday"+"dir");
       }
       if(day==7){
           System.out.println("Haftanin"+day+"."+"Saturday"+"dir");
       }else{
           System.out.println("sen gun degilsin");
       }
    }
}
