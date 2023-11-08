package Input_Output;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8081);
       try(PrintWriter out = new PrintWriter(socket.getOutputStream())){
           out.println("Hello");
           out.println("World");
           out.println("How are you?");
       }
        socket.close();
    }
}
