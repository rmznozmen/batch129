package aalessons.day28exceptions;

public class Exceptions04test {

    public static void main(String[] args) {
    String arr[]={"A","B","G","K"};
        getElementsFromArray(arr,5);

    }
    public static void getElementsFromArray(String[]s,int idx){

        try {
            String el=s[idx];
            System.out.println(el);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }finally {
            System.out.println("data base ");
        }
    }


    }
