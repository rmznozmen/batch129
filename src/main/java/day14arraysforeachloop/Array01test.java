package day14arraysforeachloop;

import day13whileloopdowhileloop.Array01;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Array01test {
    public static void main(String[] args) {

       //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String arr[]=new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+arr[arr.length-1].length());
        //Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String br[]=new String[5];
        br[0]="Miami";
        br[1]="Istanbul";
        br[2]="Frankurt";
        br[3]="Dhaka";
        br[4]="Athena";
        System.out.println(Arrays.toString(br));

        int sum=0;

        for(int a=0;a<br.length;a++){
            sum=sum+br[a].length();
            System.out.println(sum);

        }

        //for each loop
        int sum1=0;
        for(String w:br){
            sum1=sum1+w.length();
        }
        System.out.println(sum1);

    }
    }
