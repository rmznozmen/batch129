package aalessons.day25inheritance;

   public class Car extends Vehicle {
       public int price=11000;
       public void engine(){
           System.out.println("Car Engine");
       }

    public Car(){


        System.out.println("Car 1");
    }

    public Car(String make){

        System.out.println("Car 2: " + make);
    }

}

