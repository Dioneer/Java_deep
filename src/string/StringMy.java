package string;

import java.util.Arrays;

public class StringMy {
    public static int currentRandomValue = 337;
    public static void main(String[] args) {
        String k = (new String("asd")).intern();
        example();
        int value1 = randomValue(100);
        int value2 = randomValue(100);
        System.out.println("value1 = " + value1+" value2 = " + value2);
    }
    private static void example(){
        String source = "The big brown fox jumps over the lazy dog";
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.reverse();
        for (int i = source.length()-1; i >= 0; i--) {
            stringBuilder.append(source.charAt(i));
        }
        System.out.println(stringBuilder);
    }
    private static int randomValue(int maxValue){
        currentRandomValue = currentRandomValue *1103515245+12345;
        return Math.abs(currentRandomValue/65536) % (maxValue +1);
    }

}
