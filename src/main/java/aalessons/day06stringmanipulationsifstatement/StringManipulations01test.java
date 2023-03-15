package aalessons.day06stringmanipulationsifstatement;

public class StringManipulations01test {

    public static void main(String[] args) {
        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"
        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz


        //"   Ali Can   " ==>"Ali Can"
        String sTrimmed=s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

       String tv="$456.99";
       String lapTop="$875.99";

       String tv2=tv.replace("$","");
        System.out.println(tv2);
       String lapTop2=lapTop.replace("$","");
        System.out.println(lapTop2);
        Double totalPrice=Double.valueOf(tv2)+Double.valueOf(lapTop2);
        System.out.println(totalPrice);
        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //            araba = "$500.00";    motor = "$600.0"; ==> 1000

        String araba="$500.00";

        String motor="$600.00";


        String araba1=araba.replace("$","");
        System.out.println(araba1);
        String motor1=motor.replace("$","");
        System.out.println(motor1);

        Double totalPrice2=Double.valueOf(araba1)+Double.valueOf(motor1);
        System.out.println(totalPrice2);
      //Example:"    Ramazan      OZMEN   Mardin"

        String ad="    Ramazan OZMEN Mardin";

        String ad1=ad.trim();
        System.out.println(ad1);

        //Example 4: Bir String'in hic character icermedigini(Bos String) kontrol eden kodu yaziniz


        String str ="a0";
        boolean result=str.length()==2;
        System.out.println("Karakter iceriyor mu"+ result);
        //Example 4: Bir String'in 6 dan fazla  character icermedigini(Bos String) kontrol eden kodu yaziniz
        String str14="Ali Cano";
        boolean result14=str14.length()==7;
        System.out.println("6 dan fazla mi"  +result14);
        //2.yol

        boolean result15=str14.isEmpty();
        System.out.println("Bos mu"+ result15);










    }
}
