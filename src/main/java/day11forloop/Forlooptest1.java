package day11forloop;

public class Forlooptest1 {
    public static void main(String[] args) {
        //Verilen bir string Polindrome olup olmadigini kontrol ediniz.Polindrome ise Polindrome yaziniz

        String duz="civic";
        String ters="";

        for(int i=duz.length()-1;i>=0;i--) {

            ters = ters + duz.charAt(i);

        }
            if(duz.equalsIgnoreCase(ters)){
                System.out.println(duz+"=Polindrimedir");
            }else{
                System.out.println(duz+"=Polindrome degildir");
            }
        }
    }

