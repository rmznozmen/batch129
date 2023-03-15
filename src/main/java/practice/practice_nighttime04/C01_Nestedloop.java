package practice.practice_nighttime04;

import java.util.Scanner;

public class C01_Nestedloop {
    public static void main(String[] args) {
        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

/*


^
^^
^^^
^^^^
^^^^^
|||
|||
|||
|||
|||


 */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen Agacin tac uzunlugunu giriniz ");
        int tac= input.nextInt();

        String yaprak="^";
        for(int i=0;i<tac;i++)//Satir kontrol

        System.out.println(yaprak);


    }

}
