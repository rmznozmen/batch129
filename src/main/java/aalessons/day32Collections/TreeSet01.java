package aalessons.day32Collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one=System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);
        long two=System.nanoTime();

        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);

        TreeSet<Integer> hts=new TreeSet<>(hs);
        System.out.println(hs);


        System.out.println(hs);//Random(Rastgele)
        long three=System.nanoTime();

        System.out.println("TreeSet in uygulama suresi"+(two-one));
        System.out.println("HashSet in uygulama suresi"+(three-two));

        //Note:TreeSet eleman eklemede cook yavas,HashSet ise cook hizlidir.
        //     TreeSetin bu negatif yonunden kurtulmak icin eleman eklerken Hashset olusturur,elemanlari ekler ve sonra HashSeti
        //      TreeSete ceviririz.

        int fisrt=ts.first();
        System.out.println(fisrt);//3

        int last=ts.last();
        System.out.println(last);//32

        int floor1=ts.floor(15);
        System.out.println(floor1);//12==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirdi.
        //floor() methodun kullnabilecegimiz sayi  en kucuk elemanden az olamaz.
        int floor2=ts.floor(15);
        System.out.println(floor2);//12==>12 elemanlardan biri oyuzden 12 yazdirdi

       int ceiling1= ts.ceiling(15);
        System.out.println(ceiling1);//25==>15 elemalardan biri degil o yuzden 15 den sonraki eleman yazdirdi.
        //floor() methodun kullnabilecegimiz sayi  en buyuk elemanden buyuk olamaz.
        int ceiling2=ts.ceiling(25);
        System.out.println(ceiling2);//25==>25 elemalardan biri oyuzden 25i yazdirdi.


        SortedSet<Integer> tailSet1=ts.tailSet(12);
        System.out.println(tailSet1);//[12,25,32] 12 elemanlardan biri o yuzden 12 ve sonraki bir set icinde yazdirildi
        SortedSet<Integer> tailSet2=ts.tailSet(15);
        System.out.println(tailSet2);//[25,32]==>15 Elemanlardan biri degil o yuzden 15 den sonraki elemanlar bir set icinde yazdririldi


        //12 ve sonraki elemanlar bir Set icinde yazdirildi,ama ikinci parametre de "false" kullandigim icin haric tutuldu.
       NavigableSet<Integer> tailSet3= ts.tailSet(12,false);
        System.out.println(tailSet3);//[25, 32] 12 true yapsak 12 yi de gosterir.


      SortedSet<Integer>headSet1= ts.headSet(12);
        System.out.println(headSet1);//[3, 8]12 elemanlardan biri onceki elemanlar bir set icinde yazdirildi.12 yazdirilmadi.

        SortedSet<Integer>headSet2= ts.headSet(12,true);
        System.out.println(headSet2);//[3, 8,12 ]12 elemanlardan biri onceki elemanlar bir set icinde yazdirildi.12 yazdirilmadi.
        //Generic Method:Normal Methodlar parametrelerde berlitilen data typelari ile calisirlar.
        //  Generic Methodlar ise verilen her turlu data type ile calisma becerisine sahiptirler
        Integer higher1=ts.higher(12);
        System.out.println(higher1);//[25]==>12 den bir sonraki elemani verir

        Integer lower1=ts.lower(12);
        System.out.println(lower1);// 8==>12 den onceki elemani verir.



    }

}
