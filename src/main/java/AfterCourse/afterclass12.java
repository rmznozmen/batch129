package AfterCourse;

import java.util.Scanner;

public class afterclass12 {
    public static void main(String[] args) {
        ////Example : Kullanicidan iki sayi ve yapilacak islemi alan ve toplama cikarma carpma bolme v yuzde gibi
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen iki sayiniz");
        double a=input.nextDouble();
        double b=input.nextDouble();
        System.out.println("Yapilacak islemi seciniz,top icin +,cikarma icin -,carpma *,bolme icin / isareti kullaniniz");
        char islem=input.next().charAt(0);

        switch(islem){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            default:
                System.out.println("Bu islem tamamlanmistir.");



        }
    }
}
