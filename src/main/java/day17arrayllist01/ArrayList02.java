package day17arrayllist01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Array list olusturuken sag tarafa(constructor)ArrayList yazmak zorundasiniz
        //Ama sol taraf ister "ArrayList" yazin istersenizde "List" yazin ikisi de calisir.

        List<Character> initials=new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');
        //Bir Liste kac eleman oldugunu nasil anlariz?()size methodu.

       int numOfElement=initials.size();
        System.out.println(numOfElement);//4

        //Note:Arraylerden bahsederkken "length"kullanin.Listlerden bahsederken size kullanin.**


        //Bir listten istenen bir eleman nasil alinir?

        char u=initials.get(2);//M
        System.out.println(u);

        //Example01:Verilen bir String List"teki tum elemanlarin toplam karakter sayisini bulan kodu yaziniz.

        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        int sum=0;
        for(String w:cities){

           sum=sum+w.length();

        }


        System.out.println(sum);//26

        //2.Yol:

        int toplam=0;

        for(int i=0;i< cities.size(); i++){


           toplam=toplam+ cities.get(i).length();
        }

        System.out.println(toplam);//26

        //Bir "List"teki istenen bir elemani nasil degistirebilirz?set methodu.Replace gibi

        cities.set(0,"New York");
        System.out.println(cities);

       // Example2:Maas "List"i olsutunuz ve maaslara yuzde 20 zam yapiniz.

        List<Double> salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        int idx=0;

        for(Double w:salary){
             salary.set(idx,w*1.20);

             idx++;

        }
        System.out.println(salary);

        //2.Yol For loop kullanilam

        for(int i=0; i<salary.size();i++){
          salary.set(i,salary.get(i)*1.20);
        }
        System.out.println("zamli Maas"+salary);

    }
}
