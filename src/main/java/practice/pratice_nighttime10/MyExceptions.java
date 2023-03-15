package practice.pratice_nighttime10;

public class MyExceptions extends Exceptions{


         static final String str="Sen Degerlisin";

         public MyExceptions(String str){

             super(str);
             System.out.println("oyun oynadi");


         }


        public MyExceptions(){
            super(str);

        }


}
