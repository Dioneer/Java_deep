package Input_Output;

import java.io.*;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        File file2 = new File("111.txt");
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
        /**
         * reader, writer
         */
//        try(FileWriter writer = new FileWriter(file); FileReader reader = new FileReader(file2)){
//            int i = -1;
//            while ((i = reader.read())!=-1) {
//                writer.write((char)i);
//            }
//        }catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        try(FileReader reader = new FileReader(file)){
//            int line = -1;
//            StringBuilder stringBuilder = new StringBuilder();
//            while((line = reader.read())!= -1) {
//                stringBuilder.append((char)line);
//            }
//            System.out.println(stringBuilder);
//            }catch(IOException ex){
//            System.out.println(ex.getMessage());
//            }
        /**
         * stream
         */
//        try(FileOutputStream fos = new FileOutputStream(file); FileInputStream fis = new FileInputStream(file2)){
//            String arr = "Privet";
//            fos.write(arr.getBytes());
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file)); DataInputStream fis = new DataInputStream(new FileInputStream(file))){
//            dos.writeUTF("Privet");
//            dos.write(123);
//            System.out.println(fis.readUTF());
//            System.out.println(fis.read());
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
        /**
         * buffer
         */
//        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
//            StringBuilder stringBuilder = new StringBuilder();
//            int l = -1;
//            while ((l = bis.read()) != -1){
//                System.out.println((char) l);
//            }
//        }catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
        /**
         * socket
         */
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket input = serverSocket.accept();
        StringBuilder stringBuilder = new StringBuilder();
        try(Scanner in = new Scanner(input.getInputStream())){
        while (in.hasNext()){
            stringBuilder.append(in.next()).append(" ");
            }
        }
        input.close();
        System.out.println(stringBuilder);
    }
}
