package Thread;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> u = IntStream.of(1,2,3,4,5).boxed().toList();
        MyThread myThread = new MyThread();
//        myThread.start();
//        Thread.sleep(1000);
        myThread.join();
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
//        Thread.sleep(10);
        System.out.println(u);
        MyThread3 t1= new MyThread3();
        Thread thread1 = new Thread(t1);
        thread1.start();
        Thread thread2 = new Thread(t1);
        thread2.start();
        Thread.sleep(10);
        System.out.println(t1.getX());
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.print(i);
            Thread.yield();
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from my thread runnable");
    }
}

class MyThread3 implements Runnable{
    Lock lock = new ReentrantLock();
    int x = 0;
//synchronized
    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 50; i++) {
            int temp = x;
            temp++;
            x = temp;
            lock.unlock();
        }
    }

    public int getX() {
        return x;
    }
}