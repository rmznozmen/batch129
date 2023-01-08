package day10switchloops;

public class Loops01test {
    public static void main(String[] args) {
        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan caharacter'lerini buyuk harf yapiniz
        //           istanbul ==> ITNU

        String s="istanbul";
        for(int i=0;i<s.length();i++){
            String ch=s.substring(i,i+1);
            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }


    }
}
