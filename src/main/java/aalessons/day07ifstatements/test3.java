package aalessons.day07ifstatements;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay isimi giriniz");
        String monthName = input.next().toLowerCase();

        if (monthName.equalsIgnoreCase("January")) {
            System.out.println("1");
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println("2");
        } else if (monthName.equalsIgnoreCase("March")) {
            System.out.println("3");
        } else if (monthName.equalsIgnoreCase("April")) {
            System.out.println("4");
        } else if (monthName.equalsIgnoreCase("May")) {
            System.out.println("5");
        } else if (monthName.equalsIgnoreCase("Jun")) {
            System.out.println("6");
        } else if (monthName.equalsIgnoreCase("july")) {
            System.out.println("7");
        } else if (monthName.equalsIgnoreCase("Agust")) {
            System.out.println("8");
        } else if (monthName.equalsIgnoreCase("September")) {
            System.out.println("9");
        } else if (monthName.equalsIgnoreCase("October")) {
            System.out.println("10");
        } else if (monthName.equalsIgnoreCase("November")) {
            System.out.println("11");
        } else if (monthName.equalsIgnoreCase("December")) {
            System.out.println("12");
        } else {
            System.out.println("sen ay degilsin");
        }
    }
}
