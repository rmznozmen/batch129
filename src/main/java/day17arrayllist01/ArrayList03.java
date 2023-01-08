package day17arrayllist01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");

        System.out.println(cities);
        //remove() index ile kullanilirsa o indexteki elemani siler.
        //remove ()methodu index ile kullanilirsa size sildigi elemani verir.
        String n=  cities.remove(1);//istanbul gider
        System.out.println(n);//Istanbul
        System.out.println(cities);

        //remove()methodu eleman ile kullanilirsa ilk gorunumu siler
        //remove()methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden
        //true veya false verir
        //Eger eleman Liste var ise o elemani siler ve siler ve size true der
        //Eger eleman Listte yok ise o elemani silemediginden ve size false der

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        boolean p=cities.remove("Kayseri");//oble ile silme
        System.out.println(p);
    }

}
