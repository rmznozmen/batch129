package pratice_nighttime07;

import java.sql.SQLOutput;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        System.out.println(car1.counter);//calisir ama tavsiye edilnmez.
        System.out.println(Car.counter);//en guzeli bu.//4
        System.out.println(car1.price);//20001

        System.out.println(Car.counter);//4
        System.out.println(car2.price);//20001

        System.out.println(Car.counter);//4
        System.out.println(car3.price);//2001

        System.out.println(Car.counter);//4
        System.out.println(car4.price);//2001







    }//main
}//class
