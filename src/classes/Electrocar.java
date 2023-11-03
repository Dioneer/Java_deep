package classes;

public class Electrocar {
    private static int id;
    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;
        class AddClass{
            public void newMethod(){
                System.out.println("Method work " + x);
            }
        }
        AddClass addClass = new AddClass();
        test(addClass);
        System.out.println("Electrocar " + id + " is starting...");
    }
    public void test(Object addClass){
        System.out.println(addClass);
    }
    private class Motor{
        public void startMotor(){
            System.out.println("Motor is starting..." + id);
        }
    }
    public static class Battery{
        public void charge(){
            System.out.println(id+" is charging");
        }
    }
}
