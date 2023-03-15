package practice.pratice_nighttime09;

public class Browser {

    public static void main(String[] args) {

        String adresCubugu="Her Browserin adres cubugu vardrir;" ;

        Edge edge=new Edge();
        edge.search();
        edge.sifreKaydetme();
        edge.get();

        Edge edge2=new Edge(adresCubugu);
        System.out.println(edge2.adressCubugu);



    }//main

     public void get(){
         System.out.println("Browserlar Web Sayfasina Gider");
     }

    public void search(){
        System.out.println("Browserlar Arama Yapar");
    }

    public void sifreKaydetme(){

        System.out.println("Browserlar istenildiginde sifre kaydeder");
    }

}//class
