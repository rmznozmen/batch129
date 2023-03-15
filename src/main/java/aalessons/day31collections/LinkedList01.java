package aalessons.day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
          1)interfacelerden object olusturulamaz cunku interfacelerin constructori yoktur.
          2)Abstract Class'dan object olusturulamaz,constructorkari vardir ama constuctor object olusturmada kullanilamaz.
          3)interfacelerin constructorlari olmadigindan collection olustururken interface "new" keyword'unden sonra kullanilmaz.
          4)class-->clas==>extends
            class-->interface==>implements
            interface-->interface==>extends
            interface-->class==>Bu mumkun degildir
          5)Arraylistler elemen ekleme ve silme islemlerinde basarisizdir.O yuzden eleman silme ve ekleme islemleri coklukla
           yapilacaksa arraylisti kullanmayi tavsiye edilmez.
      6 LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkedList’leri
           eleman ekleme ve silmede cok basarili hale getirir.
           Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.
           7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
           8)LinkedList search islemlerinde basarisizdir.Cunklu LinkedList adres kullanmaz herhangi bir elemani bulmak
           icin en bastan butun elemanlari kontrol edilir.Buda cok fazla is demektir.





     */

    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);// [Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);// [Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");// "addLast()" is equivalent to "add()"
        System.out.println(names);// [Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3, "Suleyman");
        System.out.println(names);// [Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda");//Ilk Ajda'yi siler ve loop'u kirar
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        String r1 = names.remove();//Retrieves and removes the first element of this list.(Cut + Paste)
        //Ilk elemani siler ve size verir
        System.out.println(r1);//Cuneyt
        System.out.println(names);// [Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]


        //Retrieves, but does not remove, the first element of this list.(Copy + Paste)
        //Returns: the head of this list, or null if this list is empty
        //Ilk elemani silmeden size verir
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]


        //Retrieves and removes the head first element of this list.(Cut + Paste)
        //Returns:the head of this list, or null if this list is empty
        //remove() bos LinkedList'te kullanilirsa "hata verir", poll() bos LinkedList'te kullanilirsa "null" verir.
        names.poll();


        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        names.pop();
    }
}