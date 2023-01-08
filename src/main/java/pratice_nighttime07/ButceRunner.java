package pratice_nighttime07;

public class ButceRunner {

    public static void main(String[] args) {

        Butce baba=new Butce();
        System.out.println("Maas Oncesi Butce:"+Butce.butce);
        baba.maasAl(3000);
        System.out.println("Maas Sonrasi butce:"+Butce.butce);
        baba.harclikAl(100);
        baba.harclikHarca(20);
        baba.ButcedenHarca(500);
        System.out.println(baba.harclik);
        System.out.println(Butce.butce);

        Butce anne=new Butce();
        anne.maasAl(5000);
        anne.harclikAl(500);
        anne.harclikHarca(450);
        System.out.println(Butce.butce);//7100
        System.out.println(anne.harclik);//50

        Butce cocuk=new Butce();
        cocuk.harclikAl(100);
        cocuk.harclikHarca(30);
        System.out.println(Butce.butce);//6800
        System.out.println(cocuk.harclik);//70




    }//main

}//class
