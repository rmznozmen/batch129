package aalessons.day02datatypesmethodcreation;

public class Variables01 {

    //Primitive data types-->char-boolean-byte-short-int-long-float-double
    //float:Virgullu(ondalik sayilar,decimal number) sayilar icin kullanilir.(fiyatlandirmalar-12.99).az yer kaplr
    //Float memory de 4 byte yer kaplar.
    //double:Virgullu(ondalik sayilar,decimal number) sayilar icin kullanilir. (hucre Agirligi:0.0000000012)
    //double memory de 8 byte yer kaplar.

    public static void main(String[] args) {

        //Ornek1: Gomlek ayakkabi fiyatlari icin 2 tane variable olusturup toplam fiyati ekrana yazdiriniz.

        String shirt1="500TL";
        String shirt2="400TL";

        String shirt3=shirt1.replace("TL","");
        System.out.println(shirt3);
        String shirt4=shirt2.replace("TL","");
        System.out.println(shirt4);
        double toplamFiyat=Double.valueOf(shirt3)+Double.valueOf(shirt4);
        System.out.println("Odenecek Toplam Fiyat"+ toplamFiyat);



        //Java decimal numbersi otomatik olarak double kabul eder.Data type float yazmazsak hata verir
        //Float olmasinda israr ediyorsak sonuna "F" veya "f" koymamiz gerekiyor.
        // Interview sorulari olabilir.Ozellikleri
        //Note1:Primitive data type'larini Java olusturmustur,biz olusturamayiz.
        //Note2:Primitivelerin data typeleri isimleri sadec kucuk harfle kullanilir.
        //Note3:Primitive data'lar data type 'lara gore memory farkli farkli kaplarlar.
        //Note4:Primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.
        float shirtPrice =12.99F;
        float shoesPrice =15.89F;
         //System.out.println() ekrana yazdirir ve pointeri bir sonraki satira koyar.
         ////System.out.println() ekrana yazdirir ve pointeri bir ayni  satira tutar.
      System.out.println(shirtPrice + shoesPrice);

        //System.out.println() yazdirmanin kisa yolu==>sout yaz enteri bas.

        System.out.println();
        //Ornek2:Hucre agirligi ve Amipin agirligi icin iki tane variable olusturun ve agirliklari farklini ekrana yazdirin.

        double weightCell = 0.000000000000112;
        double weightAmip=  0.000000000000023;

        System.out.println(weightCell - weightAmip);



       float oldYear=95.000F;
       float newYear=200.000F;

        System.out.println(oldYear-newYear);




    }
}
