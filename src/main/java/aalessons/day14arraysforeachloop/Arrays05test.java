package aalessons.day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05test {
    public static void main(String[] args) {
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        int num1=Arrays.binarySearch(colors,"Red");
        System.out.println(num1);
        int num2=Arrays.binarySearch(colors,"Blue");
        System.out.println(num2);
    }
}
