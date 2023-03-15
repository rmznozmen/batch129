package aalessons.day31collections;

import java.util.HashSet;

public class HashSet01 {
    /* "hash bir tekniktir,Java bu teknigi kullanarak benzerlik datalar uretir.
        "Set" tekrarsiz data depolaman icin kullanilan bir Collection dir.
        Set tekrar kabul etmez,Yani tekrarsiz verilero depolamak icin kullanilir.

        "Set"ler 3 e ayrilir.
        i)Hashset:a)Super hizlidir,cunku Hashsetler verdiginiz elemanlari siralamk icin zaman kaybetmez
                 yani ;HashSetlere eklenen elemenlar rastgele siralanirlar.
                  b)HashSetler tekrarli elemana musaade etmezler
                  c)HashSetler sadece 1 tane "null" eleman olarak kabul ederler,
        ii)LinkedHashSet:
              a)LinkedHashSet elemanlari "insertioan order"a gore dizer.
              b)LinkedHasSet elemanlari siralamakta zaman kaybettigi icin, HashSete gore yavastir,
        iii)TreeSet:a)TreeSet elemanlari "natural order"(Kucukten buyuge veya alfabetik sira)a gore dizer.
                    b)TreeSet. "natural order" yaparken cok zaman harcar o yuzden en yavas "set"dir.
                    c)HashSetler tekrarli elemana musaade etmezler
     */


    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78]==>gordugunuz gibi elemanlar rastgele siralandi.

        int hc=hs.hashCode();
        System.out.println(hc);//329








    }

}
