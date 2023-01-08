package practice_nighttime02;

public class C02_MethodCreationTest {

    public static void main(String[] args) {
        //protokol tribunu == vip ==static
        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz

        dikdortgeninAlani(5);

        System.out.println("DikdortgeninAlani="+dikDortgeninAlani(5, 3));
    }//main

    public static int dikDortgeninAlani(int a,int b){
        return a*b;


    }//methodboys
     //Dikdortgenin alanini hesaplayiniz

    private static void dikdortgeninAlani(int a){

        int dikdortgeninAlani=a*a;
        System.out.println("Dikaalani="+(a*a));

    }//method body

}//class
