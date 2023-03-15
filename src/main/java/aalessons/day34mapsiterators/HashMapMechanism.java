package aalessons.day34mapsiterators;

import java.util.HashMap;

public class HashMapMechanism {
    /* interview de soruluyor
      1)Siz HashMap olusturmak icin "HashMap<String,Integer> hm= new HashMap();" kodunu  yazdigimizda Java
        16 tane "bucket"(kova) olusturur.ve bu "bucket"lari 0 dan 15e jadar indexler.

        2)Siz entryi  eklemek icin "hm.put("Istanbul",17000000):=; kodunu yazdiginizda Java;
        i)"key"icin "hashCode" uretir.
        ii)"HashCode" u 16 ya boler.
        iii)Kalani index olarak kullanip indexi kalana esit olana bucket a bu "entry"i yerlestirir.
        iv)Bucketa "entery"eklenirken, Java o bucket icinde "LinkedList" yapisini kullanir.


     */



    public static void main(String[] args) {


        HashMap<String,Integer> hm=new HashMap<>();


        hm.put("Istanbul",17000000);
        hm.put("Maimi", 5000000);
        hm.put("Moscow",1800000);
        hm.put("New Delhi",31000000);

        System.out.println(hm);

    }

}
