package day12forloopwhileloop;

public class WhileLoop01test {
    public static void main(String[] args) {
        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz

       // for (int i = 3; i < 7; i++) {
          //  System.out.println(i);

        //2.yol
       // int k = 3;

      //  while (k < 7) {
           // System.out.println(k);
         //   k++;

       // }
        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz

        int a=23;
        int sum=0;

       while(a>11){
           if(a%2==0){
               sum=sum+a;

               System.out.println(sum);
           }
           a--;
       }
        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        int num=-576;
        num=Math.abs(num);

        int toplam=0;
        while (num>0){
            toplam=toplam+num%10;
            num/=10;

        }
        System.out.println(toplam);



        }

    }
