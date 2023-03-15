package aalessons.day29exceptions;

public class Exceptions01test {

    public static void main(String[] args) {

        Object obj=70;
        String str="";

        try{
            str=(String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.out.println("Her data typeni cevrilmez");
        }finally {
            System.out.println("database kes ");
        }


    }
}
