package myQueue;

public class Main {
    public static void main(String[] args) {
        SimpleQueue<Integer> arr= new SimpleQueue<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(33);
        System.out.println(arr);
        SimpleStack<Integer> arr2 = new SimpleStack<>();
        arr2.push(1);
        arr2.push(2);
        arr2.push(33);
        arr2.push(44);
        arr2.pop();
        System.out.println(arr2);
    }
}
