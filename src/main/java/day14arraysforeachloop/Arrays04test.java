package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays04test {
    public static void main(String[] args) {
        //Example 1: String bir array olusturnuz, 6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";
        for (String w : colors) {
            if (w.equalsIgnoreCase("Yellow")) {
                break;
            }
            System.out.println(w);
        }
        for (int i = colors.length - 1; i>=0; i--) {
            if (colors[i].equals("Yellow")) {
                break;

            }
            System.out.println(colors[i]);

        }
    }
}
