package AfterCourse;

import java.util.Scanner;

public class aftercCourse01 {
    public static void main(String[] args) {


    String a="Java is big oppurtiny for IT";


        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        
        boolean endWith=a.endsWith("IT");//beklentim true olacak
        System.out.println("endWith = " + endWith);

        //s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz

        String s2=a.replace("big","money");
        System.out.println(s2);




    }



}
