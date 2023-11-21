package rAndRStream;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Programm {
    String word = new String("hello").intern();
        public static void main(String[] args) throws MalformedURLException {
        File file = new File("test.txt");
//        try(PrintWriter writer = new PrintWriter(file)){
//            writer.println("Hello");
//            writer.println("word");
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(Scanner scanner = new Scanner(file)){
//            while(scanner.hasNext()){
//                String rez = scanner.next();
//                System.out.println(rez);
//            }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//            URL url = new URL("https://ya.ru/");
//        try(Scanner scanner = new Scanner(url.openStream())){
//            while(scanner.hasNext()){
//                String rez = scanner.next();
//                System.out.println(rez);
//                }
//        }catch(IOException e){
//                System.out.println(e.getMessage());
//        }
//
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));DataInputStream dis = new DataInputStream(new FileInputStream(file))){
                String s = "How do you do?";
                dos.write(s.getBytes());
                while (dis.available() >0){
                    System.out.print((char)dis.read());
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }

    }
}
