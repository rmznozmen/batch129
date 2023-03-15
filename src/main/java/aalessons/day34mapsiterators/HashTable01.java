package aalessons.day34mapsiterators;

import java.util.Hashtable;

public class HashTable01 {


    /*
      1)HashTable "threa-safe" ve "synchronized"dir.
      2)HashTable elemanlari rastgele siralar.
      3)Hashtabler HashMaplere gore daha yavastirlar

     */
    public static void main(String[] args) {

        Hashtable<Integer,Integer> ht=new Hashtable<>();

        ht.put(1,2);
        ht.put(2,4);
        ht.put(6,8);

        System.out.println(ht);


    }
}
