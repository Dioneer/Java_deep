package Input_Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        /**
         * write text
         */
//        try(PrintWriter pw = new PrintWriter(file)) {
//            pw.println("Hello world, my dream!");
//        }catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
        /**
         * read scanner
         */
//        try(Scanner scanner = new Scanner(file)){
//            StringBuilder text = new StringBuilder();
//            while (scanner.hasNext()){
//                text.append(" ").append(scanner.next());
//            }
//            System.out.println(text);
//        }catch(FileNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }
        /**
         * URL
         */
//        URL url = new URL("https://ya.ru/");
//        try(Scanner scanner = new Scanner(url.openStream())){
//            StringBuilder stringBuilder = new StringBuilder();
//            while (scanner.hasNext()){
//                stringBuilder.append(" ").append(scanner.next());
//            }
//            System.out.println(stringBuilder);
//        }catch(FileNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }
        System.out.println();
    }
}
