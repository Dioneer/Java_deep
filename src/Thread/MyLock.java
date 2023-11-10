package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock {
    public static void main(String[] args) throws InterruptedException {
        MyThread4 tt = new MyThread4();
        Thread t1 = new Thread(tt);
        t1.start();
        Thread t2 = new Thread(tt);
        t2.start();
        Thread.sleep(1);
        System.out.println(tt.getX());
    }
}
class MyThread4 implements Runnable{
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
        }
        lock.unlock();
    }

    public int getX() {
        return x;
    }
}