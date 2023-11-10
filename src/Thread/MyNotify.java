package Thread;

public class MyNotify {
    static Account1 account = new Account1();

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyDeposit1());
        Thread t2 = new Thread(new MyWithdraw1());
        t1.start();
        t2.start();
    }
    static class MyDeposit1 extends Thread{
        public void run(){
            try {
                account.deposit(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static class MyWithdraw1 extends Thread{
        public void run(){
            try {
                account.withdraw(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Account1{
    int balance = 0;

    public synchronized void deposit(int amount) throws InterruptedException {
        Thread.sleep(1000);
        balance += amount;
        notifyAll();
        System.out.println("Balance is update " + balance);
    }
    public synchronized void withdraw(int amount) throws InterruptedException {
        while (amount > balance){
            wait();
        }
        balance-=amount;
        System.out.println("Balance is withdraw " + balance);
    }
}
