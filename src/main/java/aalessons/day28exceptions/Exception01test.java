package aalessons.day28exceptions;

public class Exception01test {

    public static void main(String[] args) {

        int a = 12;
        int b = 0;
        divide(a,b);

    }

    public static void divide(int a, int b) {

        try {
            System.out.println("a/b=" + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Divide cannot be by zero");
            System.out.println(e.getMessage());
        }
    }
}




