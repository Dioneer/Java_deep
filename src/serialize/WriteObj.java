package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args){
//        Person person1 = new Person(1, "Ira");
//        Person person2 = new Person(2, "Mirra");
//
//       try(FileOutputStream fos = new FileOutputStream("people.bin"); ObjectOutputStream oos = new ObjectOutputStream(fos)){
//            oos.writeObject(person1);
//           oos.writeObject(person2);
//       }catch(FileNotFoundException e){
//           System.out.println(e.getMessage());
//       }catch(IOException e){
//           System.out.println(e.getMessage());
//       }
          Person[] people= {new Person(1, "Ira"), new Person(2, "Mirra")};
          try(FileOutputStream fos = new FileOutputStream("people.bin"); ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeInt(people.length);
              for (Person person: people) {
                  oos.writeObject(person);
              }
       }catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }catch(IOException e){
           System.out.println(e.getMessage());
       }

    }
}
