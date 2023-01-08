package day18Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Example1:Integer bir list olusrtunuz.
        //Listte 5 tane eleman ekleyiniz
        //Bu elemanlarindan 12yi siliniz.

        List<Integer> ages=new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note=Siz java da tamsayi yazdiginizda java o tamsayinin data typeni otomatik olarak primitive int olarak kabul
        //eder.Bu yuzden () methodunun icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir.

        //1.yol
      // Integer nonPrimitive=12;
      // ages.remove(nonPrimitive);
        //2.yol
        ages.remove((Integer) 12);//recommmended

        //3.yol

        //ages.remove(Integer.valueOf(12));//2 method kullanildi

        //4/yol

       // ages.remove(ages.indexOf(12));//2 method kullanildi.

        System.out.println(ages);

        //Example1:Integer bir list olusrtunuz.
        //Listte 5 tane eleman ekleyiniz
        //Bu elemanlarindan tum  12leri siliniz.


        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        //RemoveAll() methodu bir veya birden fazla elemanin tum gorumlerinisi silmek icin kullanilir.
        List<Integer> silinecekler=new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);

       nums.removeAll(silinecekler);
        System.out.println(nums);
    }

}
