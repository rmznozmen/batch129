package aalessons.day16multidimensionalarryas;

public class Star {


    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i < row; i++) {
            for (int k = 1; k < row; k++) {
                System.out.print(" ");
            }

            for (int m = 1; m <= 2 * i - 1; m++) {
                if (m == row || m == 1 || m == 2 * i - 1) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

}
