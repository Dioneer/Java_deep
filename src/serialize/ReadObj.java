package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObj {
    public static void main(String[] args) {
//        try(FileInputStream fis = new FileInputStream("people.bin"); ObjectInputStream ois = new ObjectInputStream(fis )){
//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();
//            System.out.println(person1);
//            System.out.println(person2);
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        try(FileInputStream fis = new FileInputStream("people.bin"); ObjectInputStream ois = new ObjectInputStream(fis )){
            int i = ois.readInt();
            Person[] person = new Person[i];
            for (int j = 0; j < i; j++) {
                person[j] = (Person) ois.readObject();
            }
            System.out.println(Arrays.toString(person));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
