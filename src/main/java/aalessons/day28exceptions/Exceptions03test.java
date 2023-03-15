package aalessons.day28exceptions;

public class Exceptions03test {
    public static void main(String[] args) {
        String r="Lorin";
        getCharFromString(r,4);


    }

    public static void getCharFromString(String r,int idx){

        try {
            char ch=r.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}



