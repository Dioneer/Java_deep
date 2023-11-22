package myQueue;

import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T> {
    ArrayList<T> arr = new ArrayList<>();
    @Override
    public void push(T item) {
        arr.add(item);
    }

    @Override
    public T pop() {
        return arr.remove(arr.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public String toString() {
        return "SimpleStack{" +
                "arr=" + arr +
                '}';
    }
}
