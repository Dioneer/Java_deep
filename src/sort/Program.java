package sort;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        bubleSort();
//        selectionSort();
//        insertionSort();
        int[]arr = {1,2,6,4,7,5,2,11,16};
        mergeSort(arr);
    }
    public static void bubleSort(){
        int[]arr = {1,2,6,4,7,5,2,11,16};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(){
        int[]arr = {1,2,6,4,7,5,2,11,16};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(){
        int[]arr = {1,2,6,4,7,5,2,11,16};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
        public static void mergeSort(int[]arr){
        int n = arr.length;
        if(n==1) return;
        int mid = n/2;
        int[] small = new int[mid];
        int[] big = new int[n-mid];
            for (int i = 0; i < mid; i++) {
                small[i] = arr[i];
            }
            for (int i = mid; i < n; i++) {
                big[i-mid] = arr[i];
            }
            mergeSort(small);
            mergeSort(big);
            merge(arr, small, big);
    }
    public static void  merge(int[]arr, int[]small, int[]big){
        int left = small.length;
        int right = big.length;
        int i = 0;
        int j = 0;
        int ind = 0;
        while (i<left && j <right){
            if(small[i]<big[j]){
                arr[ind] = small[i];
                i++;
                ind++;
            }else{
                arr[ind] = big[j];
                j++;
                ind++;
            }
        }
        for (int k = i; k < left; k++) {
            arr[ind++] = small[k];
        }
        for (int t = j; t < right; t++) {
            arr[ind++] = big[t];
        }
        System.out.println(Arrays.toString(arr));
    }
}
