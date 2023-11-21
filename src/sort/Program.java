package sort;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        bubleSort();
//        selectionSort();
//        insertionSort();
    }
    public static void bubleSort(){
        int[]arr = {1,2,6,4,7,5,2,11,16};
        for (int i = 0; i < arr.length; i++) {
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
}
