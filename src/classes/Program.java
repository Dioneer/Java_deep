package classes;

public class Program {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(123);
        electrocar.start();
        Electrocar.Battery r= new Electrocar.Battery();
        r.charge();
    }

}
