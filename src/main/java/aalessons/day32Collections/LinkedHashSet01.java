package aalessons.day32Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        //LinkedHashSet olusturma

        LinkedHashSet<String> artist =new LinkedHashSet<>();


        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        artist.add("Tom");
        System.out.println(artist);//[Ajda, Tom, Brad, Angelina]set oldugu icin tekrarsiz o yuzden 1 tane tom yazdi//linkedHashset lerde index yok, cunku rastgele yerlestiriyor
    //set'ler takrarli elemani kabul etmez, fakat siz ayni elamani tekrar tekrar koyarsaniz hata vermez
    //ayni elemanin ustune yazar, yani birlestirir, sen onu bir tane gorursun. buna "override" etmek deniyor
    //istersen 1000 kere ekle set onu bir kere gosterir. buna override denir

        LinkedHashSet<String> actress=new LinkedHashSet<>();

        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);






    }
}
