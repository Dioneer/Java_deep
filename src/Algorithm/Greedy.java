package Algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Greedy {
    public static void main(String[] args) {
        int[] arr = {3,1,7,9,9};
        String res = maxNumberFromDigits(arr);
        System.out.println(res);
    }
    public static String maxNumberFromDigits(int[] digits){
//        StringBuilder stringBuilder = new StringBuilder();
////        Arrays.sort(digits);
////        for (int i = digits.length-1; i >=0 ; i--) {
////            stringBuilder.append(digits[i]);
////        }
////        return stringBuilder.toString();
        return String.join("", Arrays.stream(digits).boxed().sorted(Collections.reverseOrder()).map(String::valueOf).toArray(String[]::new));
    }
}
