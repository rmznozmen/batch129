package aalessons.day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02test {
    public static void main(String[] args) {
        //Example2:Integer array olusturunuz,icine 6 tane eleman yerlestiriniz bu elamanlarin en kucugu ile en buyu
        //gunu toplamini ekrana yazdiriniz

        int ages[]=new int[6];
        //int [] age=new int[6];boyled olur

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

        //2.yol
        int minimum=ages[0];
        int maximum=ages[0];


        for(int w:ages){
            minimum=Math.min(minimum,w);
            maximum=Math.max(maximum,w);



        }
        System.out.println(minimum+maximum);

    }
}
