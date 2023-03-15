package aalessons.day29exceptions;

public class Exceptions02 {
    /*
       1)Throw method bodysi icindee "throws ise method parantezinden hemen sonra kullanilir.
     */

    public static void main(String[] args) {

        try {
            printAge(-18);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            getMark(-90);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    //"throw" keyword bir method'un body'si icinde istedigimiz yerde, istedigimiz kosullar, istedigimiz kadar icin Exception atmamizi saglar.
    //"throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.
    //Exception Class constructor'inin parantezi icine istediginiz Exception Mesaj'ini yazabilirsiniz
    public static void printAge(int age){
        if(age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }else{
            System.out.println(age);
        }
    }

    //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
    public static void getMark(double d){

        if(d<0){
            throw new IllegalArgumentException("Marks cannot be less than zero");
        }else if(d>100){
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        }else {
            System.out.println(d);
        }

    }















}