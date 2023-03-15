package aalessons.day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03test {
    public static void main(String[] args) {
        /*
          Example 1: Asagıdaki kurallara gore kullanıcının girdiği password u kontrol ediniz
          1) En az 8 karakter olsun
          2) Space karakteri password de olmasin
          3) En az bir tane buyuk harf olsun
          4) En az bir tane kucuk harf olsun
          5) En az bir tane sembol olsun
          6) En az bir tane rakam olsun
         */

        Scanner input=new Scanner (System.in);
        System.out.println("Lutfen Passwordunuzu Giriniz...");
        String pwd=input.nextLine();
        //1.kURAL
         boolean first=pwd.length()>7;
        System.out.println(first);
        //2) Space karakteri password de olmasin
        boolean second=!pwd.contains(" ");
        System.out.println(second);
        //3) En az bir tane buyuk harf olsun
        //Note: Buyuk harf olmayanlari sil,kalan karakter sayisina bak,
        // karakter sayisi 0 ise buyuk harf yok demektir
        // sifirdan buyuk ise buyuk harf var demektir
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println(third);
        //4) En az bir tane kucuk harf olsun
       boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);
          //5) En az bir tane sembol olsun
        boolean fifth=pwd.replaceAll("[^a-zA-Z0-9]"," ").length()>0;
        //6) En az bir tane rakam olsun
        boolean sixth=pwd.replaceAll("[^0-9]"," ").length()>0;
        System.out.println("Basarili Giris"+(first&&second&&third&&fourth&&fifth&&sixth));









    }
}
