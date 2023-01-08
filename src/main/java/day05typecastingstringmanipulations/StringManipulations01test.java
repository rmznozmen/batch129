package day05typecastingstringmanipulations;

public class StringManipulations01test {
    public static void main(String[] args) {

        String s = "Java is easy";
        //Example 1: "s" String'indeki tüm karakterleri büyük harf yapınız

        String sUpper=s.toUpperCase();
        System.out.println(sUpper);//Beklenti "JAVA IS EASY"

        //Example 2: "s" String'indeki tüm karakterleri küçük harf yapınız
          String sLower= s.toLowerCase();
        System.out.println(sLower);//beklenti "java is easy"

        //Example 3: "s" String'indeki first karakteri alınız
        char firstChar=s.charAt(1);
        System.out.println(firstChar);
        //Example 4: "s" String'indeki ikinci ve sondan ikinci karakteri alınız ve ekrana yan yana yazdırınız
        char secondChar=s.charAt(1);
        char lastSecondChar=s.charAt(10);
        //1.yol
        System.out.print(secondChar);
        System.out.println(lastSecondChar);
        //2 yol
        System.out.println(""+secondChar+lastSecondChar);

        //Example 5: "s" String'inde kullanılan karakter sayısını bulunuz

       int sLength= s.length();
        System.out.println(sLength);
        //Example 6: "s" String'indeki ilk 4 karakteri alınız
        //ilk index başlangıç,ikinci index bitimin bir sonrası yazılır
        //substring(0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index hariçtir

        String sub1=s.substring(0,4);
        System.out.println(sub1);

        //Example 7: "s" String'indeki "is" kelimesini alınız

        String sub2=s.substring(5,7);
        System.out.println(sub2);
        String sub3=s.substring(8,12);
        System.out.println(sub3);

        //Example 9: "s" String'inde "money" kelimesinin var olup olmadığını kontrol ediniz

        boolean isExisting=s.contains("money");
        System.out.println(isExisting);
        //Example : "s" String'inde "java" kelimesinin var olup olmadığını kontrol ediniz
        boolean isExisting2=s.contains("java");
        System.out.println(isExisting2);
        //Example 10: "s" String'inin belli bir harf ile başlayıp başlamadığını kontrol ediniz

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);
        //Example 11: "s" String'inin 6. karakterden itibaren belli bir harfle başlayıp başlamadığını kontrol ediniz

        boolean isBeing=s.startsWith("i",5);
        System.out.println(isBeing);













    }
}
