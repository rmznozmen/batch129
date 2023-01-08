package day22staticblocksconstructors;

public class StaticBlocks01 {
    //Bir variable olusturdugunuzda deger atamazsaniz o veriableeyi initialize(baslatmak) etmediniz demektir.
    //static variablelar static blocklar icinde initialize edilirse o classin icinde herseyden once hazir hale
    //getirilmis olur.Oteldeki asci basi gibi,Yemek yapmadan herseyin hazir olur.
    //Bazen main method calistirilmadan once variablelarin hazir halde getirilmesi gerekir ve bu yuzden static blockalar kullanilir.
    //static methodlar yukardan calisir.Main ustte olsa bile
    //Staticbloklar once yazilir.

    //Note1:"static blocklar static variableri initizalize etmek icin kullanilirlar.
    //Note2:"static blocklar class icinde "herseyden once"calistirilirlar.






   static double pi;
   static String shape;


   static {
       pi=3.14;
       System.out.println("Static block 1");
   }
   static {
       shape="circle";
       System.out.println("Block 2");
   }

    public static void main(String[] args) {
        System.out.println("main method");

    }

}
