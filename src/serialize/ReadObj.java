package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObj {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("people.bin"); ObjectInputStream ois = new ObjectInputStream(fis )){
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
