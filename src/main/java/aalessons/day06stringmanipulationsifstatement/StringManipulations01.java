package aalessons.day06stringmanipulationsifstatement;

public class StringManipulations01 {


        public static void main(String[] args) {

            //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
            //             "   Ali Can   "     ==>      "Ali Can"
            String s = "   Ali Can  ";
            System.out.println(s);

            //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz
            String sTrimmed = s.trim();
            System.out.println(sTrimmed);

            //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
            //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
            String tv1 = "$456.99";
            String laptop1 = "$875.99";

            String tv2 = tv1.replace("$", "");
            System.out.println(tv2);// 456.99 ==> Ondalik sayilar Java'da otomatik olarak double kabul edilir.

            String laptop2 = laptop1.replace("$", "");
            System.out.println(laptop2);// 875.99

            Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
            System.out.println(totalPrice);//1332.98

            //Example 3: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
            //           "Ali Can" ==> AC
            String name = "    ali cAN    ";

            char first = name.trim().toUpperCase().charAt(0);
            System.out.println(first);// A

            char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
            System.out.println(second); // C

            System.out.println("" + first + second);// AC

            //Example 4: Bir String'in hic character icermedigini(Bos String) kontrol eden kodu yaziniz
            String str = "";

            //1.Yol: length() kullan
            boolean result1 = str.length()==0;
            System.out.println("String bos mu? " + result1);// true

            //2.Yol: isEmpty() kullan. Java bir konuda method uretmisse, o method'u kullanmak en iyisidir
            boolean result2 = str.isEmpty();
            System.out.println("String bos mu? " + result2); //true

            //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz

            String t = "        ";

            //1.Yol:
            boolean result3 = t.replace(" ", "").length()==0;
            System.out.println("Sadece space mi var? " + result3);

            //2.Yol:
            boolean result4 = t.replace(" ", "").isEmpty();
            System.out.println("Sadece space mi var? " + result4);

            //3.Yol:
            //isBlank() methodu sadece space iceren String'ler icin true verir, space disinda bir character icerirse false verir
            //isBlank() methodu bos String'ler icin de true verir.
            //isBlank() ==> space + hicbirsey icin true                isEmpty ==> hicbirsey icin true
            boolean result5 = t.isBlank();
            System.out.println("Sadece space mi var? " + result5);

            //Example6: Bir stringte indexi a,e,i olan characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz

            // "Java is easy to learn"==>1+5+8=14(beklenti)

            String r="Java is easy to learn";
            int idxA=r.indexOf('a');//1
            System.out.println(idxA);

            int idxI=r.indexOf('i');
            System.out.println(idxI);

            int idxE=r.indexOf('e');
            System.out.println(idxE);
            System.out.println("indexlerin topami"+(idxA+idxE+idxI));

            //Example 7: Bir stringde Java kelime ilk olarak kacinci indexe kullanildigini gosteren kod yaziniz
            //"Ah java vah Java Sensiz Olmuyor Java"==>3

            //indexOf("Java) kullaniminda siz java kelimesini ilk gorunumdeki ilk harfini (yani j nin ) indexini almis olursunuz.
            //indexOf methodu olmayan characterler icin kullanirsa her zaman "-1" verir.

            String u="Ah java vah Java Sensiz Olmuyor Java";

            int inxJava = u.indexOf("java");
            System.out.println(inxJava);
            //indexOf methodu olmayan characterler icin kullanirsa her zaman "-1" verir.
            int idxOfXyz=u.indexOf("xyz");
            System.out.println(idxOfXyz);

            //Example8:Bir stringte a,i,e characterlerinin son gorunumlerinin toplamini yazdiriniz
            // "Java is easy to learn";==>18+5+17+40

            String v="Java is easy to learn";
            int idxOfA=v.lastIndexOf('a');//18
            System.out.println(idxOfA);
            int idxofI=v.lastIndexOf('i');//5
            System.out.println(idxofI);
            int idxOfE=v.lastIndexOf('e');//17
            System.out.println(idxOfE);
            System.out.println("Toplam"+ (idxOfA+idxofI+idxOfE));

            //Note=lastIndexOf() methodo olmayan bir character icin kullanilirsa her zaman "-1" verir.

            //Example9:Bir Stringteki tekrarsiz characterleri ekrana yazdiriniz

           // Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
            // Bazi kodlarin bazi sartlara gore aktive etmek icin "if"statment kullanilir.
            //Example10:Sayi cift ise ekrana cift yazdirin

            ///Example11: sayi 3 basamakli isee ekrana "Woow" yazdirin



        }
}
