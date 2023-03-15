package AfterCourse;

public class afterclass11 {
    public static void main(String[] args) {

        String str="Java";

        String newStr="";

        int i=0;

        while (i<str.length()){

            newStr=newStr + str.charAt(i)+"+++++";

            i++;
        }


        System.out.println(newStr);

    }
}
