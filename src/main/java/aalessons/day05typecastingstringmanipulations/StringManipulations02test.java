package aalessons.day05typecastingstringmanipulations;

public class StringManipulations02test {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmediğini kontrol ediniz

        boolean isend=s.endsWith("money");
        System.out.println(isend);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine çeviriniz

        String s1=s.replace("money","dollar");
        System.out.println(s1);
        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine çeviriniz

        String s2=s.replace("earn","win");
        System.out.println(s2);

        //Example 6: "s" String'indeki tüm "e" harflerini siliniz

        String s6=s.replace("e","");
        System.out.println(s6);

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String'indeki tüm rakamları "*" a çeviriniz
        String t1=t.replaceAll("[0-9]","*");
        System.out.println(t1);

        //Example 8: "t" String'indeki tüm rakamları ve harfleri "!" e çeviriniz

        String t8=t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t8);
        //Example 9: "t" String'indeki tüm sesli harfleri "?" e çeviriniz
        String t9=t.replaceAll("[aeiou]","?");
        System.out.println(t9);
        //Example 10: "t" String'indeki küçük harfler dışındaki tüm karakterleri "<>" çeviriniz
        String t10=t.replaceAll("[^a-z]","<>");
        System.out.println(t10);
        //Example 11: "t" String'indeki tüm harfler dışındaki tüm karakterleri "+" çeviriniz
        String t5 = t.replaceAll("[^a-zA-Z]","+");




    }
}
