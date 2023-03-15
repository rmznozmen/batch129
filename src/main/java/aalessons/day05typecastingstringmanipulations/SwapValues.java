package aalessons.day05typecastingstringmanipulations;

public class SwapValues {

    //Swap:Yer degistirmektir.1.Kapta patates var 2.kapta domates==>Swap==> 1.kap domestes 2.kap Patates
    public static void main(String[] args) {

        int a=12;
        int b=5;// Beklenti Swapten sonrasi a=5 b=12 olmali(Interveiw sorusu
        int temp=0;
        System.out.println("a: "+a);
        System.out.println("b "+b);
        //1.yol
        //1.adim
        temp=a;
        //2.Adim
        a=b;
        //3.Adim
        b=temp;

        System.out.println("a:"+b);
        System.out.println("b : "+a);

      //2.Yol:
        int x=12;
        int y=5;
        x=x+y;
        y=x-y;
        x=x-y;
  ;

    }
}
