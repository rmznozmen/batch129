package aalessons.day03scanner;

import java.util.Scanner;

public class Scanner02test {
    public static void main(String[] args) {
        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Adinizi ve s Giriniz..");
        String name = input.next();
        System.out.println("lutfen Soaydinizi Giriniz..");
        String surname = input.next();
        System.out.println("Adi-Soyadi=" + name + " " + surname);

    }
}
