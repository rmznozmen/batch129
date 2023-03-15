package aalessons.day13whileloopdowhileloop;

import java.util.Arrays;

public class Array01test {
    public static void main(String[] args) {

        String stdName[]=new String[5];
        System.out.println(stdName);

         stdName[2]="Cuneyt";
         stdName[0]="Ali";
         stdName[3]="Ramazan";
         stdName[1]="Lorin";
         stdName[4]="Derya";
        System.out.println(Arrays.toString(stdName));
        System.out.println(stdName[0]);
        //Example 1: Array'deki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz.
        for(int i=0;i<stdName.length;i++){
            System.out.println(stdName[i]+"!");
        }


        }

    }