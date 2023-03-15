package aalessons.day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //Variable olusturmak
        //Java cumlesi=Statement
        //Java`da esit demek "==".Matematikte "=" Java`da "=="
        //Java`da "=" assigment operator`dir.Sagdaki degeri alir soldaki kutuya koyar.
        //Acces Modifier yazmazsaniz "acces modifier" default demektir.
        //Data Type+Variable Name==>Variable Declaration
        //Assigment Operator(Atama Opertoru) + Varible Degeri ==>Assigment
        // Eger Variable Declaration yapar, Assigment yapmazsaniz Java kendi degerlendirini (default ) koyar.
        // Default degerler sayilar icin sifir.
        //Data Type`ni yaziniz   Veriable ismi yaziniz  Assigment Operator    Veriable Degeri    Java`da noktadir
                  int                    age                    =                      13                 ;


         //ornek1: Ogrenci ismi icin varible olusuturup deger olarak Ali Can atayiniz.
        //Stringlere verilen degerler cift tirnak icinde olmalidir.
        //Stringler icin default value "null" dir.
        String studentName = "Ali Can";

        /*
           Java temelde iki tip data vardir;
           1)primitiva data type
            char:Tek karakterler icin kullanilir.A,x,?,5
            boolean:boolenalar sadece iki farkli deger alabilir.true veya false
            byte : -128`den 127`e kadar tamsayi degerleri icin kullanilir.(1 byte)
            short: -32768 ile 32767 arasindaki tam sayilar icin kullanir.(2 byte)
            int: -2,147,483,648 ile 2,147,483,467 arasindaki sayilar icin kullanilir.(4 byte)

             long: *9,223,372,836,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilari icin kullanir.
            float-double(8 byte)
           2)non-primitive type/
         */
        //Ornek2: Char data type`inde ilk ismin ilk harfi olarak variable olusturunuz ve bir deger atayiniz.
        //char data tipinde degerler tek tirnak icinde konulmadilir.
        char isminIlkHarfi = 'A';
        //Ornek 3:Boolean data type Emekli misin icin bir variable olusturun ve false degerini atayin.
        //Boolenlarda tirnak isareti konulmaz.
        boolean emeklimisin = false;

        //Ornek4: Byte type`inde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        //byte sinirlar kucuk oldugu icin memory de az yeter tutar.Int in memory cok yuksek.
        byte studentAge =23;

        //Ornek5:Site nufusu icin bir variable olusuturup deger atayiniz.
        short siteNufusu =1200;

        ///Ornek6: Ulke nufusleri icin bir variable olusturunuz ve deger atayiniz

        int ulkeNufusu =1452245000;
         //Ornek7:Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note:Bir deger long ise sonunda "L" veya "l" konulmalidir.
        long cellNumberInHumanBody = 87542215441414L;
        //Eger longa atadginiz deger intlerin arasinda ise sonununa "l" koymaya gerek cunku
        long weightOfSun =1234567;







    }
}