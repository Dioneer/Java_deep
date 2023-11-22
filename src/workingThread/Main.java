package workingThread;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BlockingQueue queue = new BlockingQueue();
        Thread worker = new Thread(() -> {
            while (true) {
                try {
                    Runnable task = queue.get();
                    task.run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        worker.start();
        for (int i = 0; i < 10; i++) {
            queue.put(getTask());
        }
    }
    public static Runnable getTask(){
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Task started: "+this);
                try{
                   Thread.sleep(1000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task finished: "+this);
            }
        };
    }
    static class BlockingQueue{
        ArrayList<Runnable> tasks = new ArrayList<>();
        public synchronized Runnable get() throws InterruptedException {
            while (tasks.isEmpty()){
                wait();
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }
        public synchronized void put(Runnable task){
            tasks.add(task);
            notify();
        }
    }
}

