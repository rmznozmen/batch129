package aalessons.day28exceptions;

public class Exceptions02Test {
    public static void main(String[] args) {


        String r="123d4";
        convertStringToInt(r);






    }

    public static void convertStringToInt(String r){

        int intR=0;

        try{
            intR=Integer.valueOf(r);

        }catch(NumberFormatException e){
            System.out.println("A String cannot be non-numeric characters to be  converted to a number");
            System.out.println(e.getMessage());
    }finally {
            System.out.println("Database cut ");
        }
        System.out.println(intR+1);
        }
}


