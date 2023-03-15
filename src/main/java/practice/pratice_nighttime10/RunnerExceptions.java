package practice.pratice_nighttime10;

import static practice.pratice_nighttime10.MyExceptions.str;

public class RunnerExceptions {

    public static void main(String[] args) {

        MyExceptions my=new MyExceptions(str);

        int x=100, y=5;

        float ortalama=(float) x/(float) y;

        if(ortalama<50){
            throw new IllegalArgumentException("Ortlama cokd Dusuk");

        }


    }
}
