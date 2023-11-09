package Input_Output;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
       try(Socket socket = new Socket("127.0.0.1", 8081);PrintWriter out = new PrintWriter(socket.getOutputStream());
           Scanner in = new Scanner(socket.getInputStream());Scanner send = new Scanner(System.in)){
           while (true){
               System.out.println("Print somthig: ");
               String word = send.nextLine();
               out.println(word);
               out.flush();
               String s = in.nextLine();
               System.out.println("You answer:" + s);
           }
       }
    }
}
