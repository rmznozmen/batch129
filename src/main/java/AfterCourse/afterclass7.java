package AfterCourse;

import java.util.Scanner;

public class afterclass7 {

    // example 2; Size verilen bir String in Polindrome olup olmadigini kontrol eden kodu yaziniz..

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Kelime Giriniz");
        String duz = input.nextLine();

        String ters = "";


        for (int i = duz.length() - 1; i >= 0; i--) {

            ters = ters + duz.charAt(i);

        }//foorloop

        if (duz.equalsIgnoreCase(ters)) {
            System.out.println("Bu islem Polindromedir");
        } else {
            System.out.println("Bu kelime Polindrome degildir");

        }//else

        //Example 1: 5`ten 8`e kadar olan tamsayilarin toplamini veren kodu yaziniz..
        // 5+6+7+8  day11/ForLoop04
        int sum = 0;
        for (int i = 5; i < 9; i++) {

            sum = sum + i;

        }
        System.out.println(sum);

        /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X
        */

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter row number");
        int row = input1.nextInt();
        System.out.println("Please enter column");
        int column = input1.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("X");
            }
            System.out.println();

        }

        Scanner input2 = new Scanner(System.in);
        int num = input.nextInt();

        int i = 1;

        while (i < 11) {

            i++;
            System.out.println(num + "*" + i + (num * i));


        }//main
    }//class
}






