package Thread;

public class DeadLock {
    public static void main(String[] args) {
        String a = "ABC";
        String b = "DEF";

        Thread t1 = new Thread(){
            public void run(){
                synchronized (a){
                    System.out.println("Time 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (b){
                    System.out.println("Time 1");
                }
            }
        };
        Thread t12 = new Thread(){
            public void run(){
                synchronized (b){
                    System.out.println("Time 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (a){
                    System.out.println("Time 2");
                }
            }
        };
        t1.start();
        t12.start();
    }
}
