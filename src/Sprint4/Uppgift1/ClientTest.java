package Sprint4.Uppgift1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTest {

    int port = 55555;

    ClientTest(){
        try(Socket socket = new Socket("localhost", port);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        ){
            String message = "This is a message";

            while(true){
                writer.println(message);
                Thread.sleep(2000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ClientTest();
    }
}
