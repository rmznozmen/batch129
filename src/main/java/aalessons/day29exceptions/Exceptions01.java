package aalessons.day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        Object obj = 70;
        String str = "";

        try {
            str = (String) obj;//ClassCastException.Birbirine donusturulmeyecek data typelarini donusturmekte israr ederseniz
            //Java ClassCastException atar.

            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("Her data typeini cevrilmez");

        }

      int a=2;
      int b=22;
        System.out.println((a/b));
    }


}
