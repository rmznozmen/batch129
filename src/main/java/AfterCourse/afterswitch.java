package AfterCourse;

import day09incrementdecrementternaryswitch.Switch01;

import java.util.Scanner;

public class afterswitch {
    public static void main(String[] args) {
        //Example 1: Yilin ay isimlerini girince kacinci ay oldugunu yazan kodu yaziniz. if+switch
        Scanner input=new Scanner(System.in);


                System.out.println("Lutfen Ay isimi giriniz);");
                String nameofMonth=input.next();

                if(nameofMonth.equalsIgnoreCase("january")){
                    System.out.println("1");
                }else if(nameofMonth.equalsIgnoreCase("february")){
                    System.out.println("2");
                }else if(nameofMonth.equalsIgnoreCase("March")){
                    System.out.println("3");
                }else if(nameofMonth.equalsIgnoreCase("april")){
                    System.out.println("4");
                }else if(nameofMonth.equalsIgnoreCase("may")) {
                    System.out.println("5");
                }else if(nameofMonth.equalsIgnoreCase("june")){
                    System.out.println("6");

                }else if(nameofMonth.equalsIgnoreCase("december")){
                    System.out.println("12");
                }else{
                    System.out.println("Gecersiz ay ismini girdiniz");
                }

        }




    }

