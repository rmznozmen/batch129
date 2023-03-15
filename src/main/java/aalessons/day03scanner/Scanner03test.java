package aalessons.day03scanner;

import java.util.Scanner;

public class Scanner03test {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  Adresinizi Giriniz..");
        String address = input.nextLine();
        System.out.println("Address=" + (address));


    }
}
