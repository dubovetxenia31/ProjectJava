package HomeWorkMetodi;

import java.util.Arrays;
import java.util.stream.Stream;

public class TextUtils {
    public static void printReverse(String text) {

//        StringBuilder stringBuilder = new StringBuilder();

        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        System.out.println("Reverse : " + result);
    }

    public static int countGlass(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void printByWord(String text) {
        int space = text.indexOf(' ');

        if (text.isEmpty()) {
            return;   //error case
        }
        if (space == -1) { //base case

            System.out.println(text);
        } else {

            printByWord(text.substring(0, space));//recursive steps
            printByWord(text.substring(space + 1));
        }
    }

    public static int countAverage(int[][] nums) {
        int summ = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                summ += nums[i][j];
                count = summ / nums.length;
            }
        }
        return  count;
    }
}