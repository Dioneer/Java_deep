package tree;

import java.util.ArrayList;
import java.util.Arrays;

public class SimleStackMy<T>implements Stack<T> {
    ArrayList<T> arr = new ArrayList<>();
    @Override
    public void push(T item) {
        arr.add(0,item);
    }
    @Override
    public T pop() {
        return arr.remove(0);
    }
    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }
}
