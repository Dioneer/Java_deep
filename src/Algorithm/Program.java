package Algorithm;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int n = 15;
        long[] mem = new long[n+1];
        Arrays.fill(mem, -1);
        long fib = fibo(n, mem);
        System.out.println(fib);
        long fib2 = fibo2(10);
        System.out.println(fib2);
        int fact = fuct(7);
        System.out.println(fact);
    }
public static long fibo(int n, long[] mem){
        if(mem[n] != -1 ) return mem[n];
        if (n <= 1) return n;
        long result = fibo(n-1, mem) + fibo(n-2, mem);
        mem[n] = result;
        return result;
}
    public static int fuct(int n){
        if(n==0) return 1;
        return n*fuct(n-1);
    }
    public static long fibo2(int i){
        long[] arr = new long[i+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int j = 2; j <= i; j++) {
            arr[j] = arr[j-2] + arr[j-1];
        }
        return arr[i];
    }

}
