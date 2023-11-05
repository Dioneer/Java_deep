package Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

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
//        int[] station = {0,200,375,550,750,950};
//        int res = minstop(station, 400);
//        System.out.println(res);
        /**
         * 3
         */
        int[] k = {1,2,3,4,5,6,7,8,9,12};
        System.out.println(binarySearch(k, 5));
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
    public static int binarySearch(int[]arr, int k){
        int start = 0;
        int end = arr.length-1;
        int middle = (int)Math.floor((start+end)/2);
        while (start<=end){
            if(k < arr[middle]){
                end = middle-1;
            } else if (k>arr[middle]) {
                start = middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
