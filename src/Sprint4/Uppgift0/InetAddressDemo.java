package Sprint4.Uppgift0;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {


    InetAddressDemo() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println(address.isMulticastAddress());

        InetAddress loopback = InetAddress.getLoopbackAddress();
        System.out.println(loopback);

        address = InetAddress.getByName("dn.se");
        System.out.println(address);

        InetAddress SW[] = InetAddress.getAllByName("www.hm.se");
        for (InetAddress addr : SW) {
            System.out.println(addr);
        }
    }

    public static void main(String[] args) throws UnknownHostException {
        new InetAddressDemo();
    }
}
