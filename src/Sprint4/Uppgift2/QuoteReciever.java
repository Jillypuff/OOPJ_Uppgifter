package Sprint4.Uppgift2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class QuoteReciever {

    QuoteReciever() throws IOException {
        int port = 44444;
        DatagramSocket ds = new DatagramSocket(port);
        byte[] bytes = new byte[254];
        while (true){
            DatagramPacket dgp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dgp);
            System.out.println(dgp.getAddress());
            String s = new String(dgp.getData(), 0, dgp.getLength());
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws IOException {
        new QuoteReciever();
    }
}
