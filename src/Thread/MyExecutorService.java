package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 25; i++) {
            executorService.execute(new MyThread5("A"));
            executorService.execute(new MyThread5("B"));
            executorService.execute(new MyThread5("C"));
            executorService.execute(new MyThread5("D"));
            executorService.execute(new MyThread5("E"));
        }
        executorService.shutdown();
    }
}
class MyThread5 extends Thread{
    String name;
    public MyThread5(String name){
    this.name = name;
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " "+name);
        }
    }
}