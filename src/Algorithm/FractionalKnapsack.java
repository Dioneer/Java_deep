package Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4,3);
        final Item item2 = new Item(3,18);
        final Item item3 = new Item(20,14);
        final Item[] items = {item1, item2, item3};
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));
        final int W = 7;
        double valueSoFar = 0;
        int weightSoFar = 0;
        int currentItem = 0;
        while(currentItem<items.length-1 && weightSoFar != W){
            if(weightSoFar + items[currentItem].getWeight() <W){
                valueSoFar += items[currentItem].getValue();
                weightSoFar+= items[currentItem].getWeight();
            }else{
                valueSoFar += (W - weightSoFar) / (double)items[currentItem].getWeight() * items[currentItem].getValue();
                weightSoFar+= W;
            }
            currentItem++;
        }
        System.out.println(valueSoFar);
    }
}
class Item{
    public double valuePerUnitOfWeight(){
        return (double) value/weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
