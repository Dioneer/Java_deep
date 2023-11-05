package Algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Greedy {
    public static void main(String[] args) {
        /**
         * ex1
         */
//        int[] arr = {3,1,7,9,9};
//        String res = maxNumberFromDigits(arr);
//        System.out.println(res);
        /**
         * ex2
         */
        int[] station = {0,200,375,550,750,950};
        int res = minstop(station, 400);
        System.out.println(res);
    }

    //    public static String maxNumberFromDigits(int[] digits){
//        StringBuilder stringBuilder = new StringBuilder();
////        Arrays.sort(digits);
////        for (int i = digits.length-1; i >=0 ; i--) {
////            stringBuilder.append(digits[i]);
////        }
////        return stringBuilder.toString();
//        return String.join("", Arrays.stream(digits).boxed().sorted(Collections.reverseOrder()).map(String::valueOf).toArray(String[]::new));
//    }
    public static int minstop(int[] stations, int l) {
        int result = 0;
        int currentStop = 0;
        while (currentStop < stations.length-1){
            int nextStop = currentStop;
            while (nextStop<stations.length-1 && stations[nextStop+1]-stations[currentStop] <= l){
                nextStop++;
            }
            if(currentStop==nextStop){
                return -1;
            }
            if(nextStop < stations.length-1){
                result++;
            }
            currentStop = nextStop;
        }
        return result;
    }
}
