package aalessons.day11forloop;

public class Forloop01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"
        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }

        System.out.println();

        //Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
        //           "Germany" ==> yn
        String t = "Germany";

        for (int i = t.length() - 1; i >= 0; i--) {
            char ch = t.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }

    }
}


