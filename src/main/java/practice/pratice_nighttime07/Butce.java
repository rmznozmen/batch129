package practice.pratice_nighttime07;

public class Butce {

    // Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
    // kullanildigi bir butce ile kisisel harcamalarin yapildigi
    // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int  butce ;//tum aileti

    public int harclik;

    public void harclikAl(int alinanHarclik){
        butce-=alinanHarclik;//ortak hesaptan harcaniyor.
        harclik+=alinanHarclik;


    }
   public void ButcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;

   }
   public void harclikHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;
   }
   public void maasAl(int alinanMaas){
        butce+=alinanMaas;

   }




}
