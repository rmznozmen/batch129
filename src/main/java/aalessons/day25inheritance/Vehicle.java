package aalessons.day25inheritance;

public class Vehicle {

    /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.

          2)Child Classdaki constructordan Parent Class"daki  constructora gidebilmek icin "super()"kullanilir.
          3)Parent Class'da birden fazla constructor varsa istenilen constructor,super() parantezi icine yazilan
          parametre yardimi ile secilebilir.
          4)Ayni class icindeki constructorlari secmek icin "this() "kullanilir.
          Ayni  Class'da birden fazla constructor varsa istenilen constructor,"this()" parantezi icine yazilan
          parametre yardimi ile secilebilir.
          5)"super()" ifadesini yazmak istege baglidir,yazmasaniz da Java sanki "super()"varmis gibi davranir.
           Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
           6)"super()" ve "this() "ifadeleri constructor icinde her zaman ilk satirda olmalidir
           7)Bir constructor icide "super()" ve "this()" ifadeeleri sadece bir kere kullanilabilir.bakiniz ..6
           8)Inheritance da variablerlari ve methodlari cagirmak icin "this"veya "super" kullanilir.
             "this"ayni class icindeki variableri ve methodlari cagirmak icin kullanilir.
             "super"parent class icindeki variableri ve methodlari cagirmak icin kullanilir.
             9)Inheritance da object kullanarak variable cagirirsaniz object in data typeni temsil eden classdan varia
             able i aramaya baslayiniz.O class da yksa parentlara bakiniz.
             10)Ineritance de object kullanara method cagirirsaniz object constructorii temsil eden classdan
             method aramaya baslayiniz.O class da yoksa parentlara bakiniz

             OOP:
             i)Inheritance
             ii)Polymorphism:Method Overloading +Method Overriding
             iii)Encapsulation
             iv)Abstraction




     */
    public int price = 12000;

    public void engine(){
        System.out.println("Vehicle Engine");
    }

    public Vehicle() {
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price) {
        System.out.println("Vehicle 2: " + price);
    }

}
