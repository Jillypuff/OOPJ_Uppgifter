package Sprint4.Uppgift2;

import java.io.IOException;
import java.net.*;

public class QuoteSender {

    QuoteSender() throws IOException, InterruptedException {
        InetAddress ip = InetAddress.getLocalHost();
        int toPort = 44444;
        DatagramSocket ds = new DatagramSocket();
        String[] quotes = {"Data never travels alone.", "Packets pave the digital highway.",
                "Secure paths, safe data.", "Bits crossing the world wide.", "Data flows, knowledge grows."};
        while(true){
            for (String quote : quotes) {
                byte[] bytes = quote.getBytes();
                DatagramPacket dgp = new DatagramPacket(bytes, bytes.length, ip, toPort);
                ds.send(dgp);
                Thread.sleep(60000);
            }
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        new QuoteSender();
    }
}
