package aalessons.day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array01test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen  Kac tane ogrenci oldugunu giriniz");
        int numberOfElemnts = input.nextInt();

        System.out.println("Cikis yapmak icin Q tiklayiniz");


        String studentNames[] = new String[numberOfElemnts];

        for (int i = 1; i <= numberOfElemnts; i++) {
            System.out.println("lutfen " + " " + i + ".ogrenci adinizi giriniz");
            String stdname = input.next();


            if (stdname.equalsIgnoreCase("Q")) {

                break;
            }
             studentNames[i-1]=stdname;
            }

        System.out.println(Arrays.toString(studentNames));

        }
    }

