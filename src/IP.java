import java.io.IOException;
import java.net.InetAddress;

public class IP {
    public static void main (String[] args) {
        String baseIP = "10.8.40.";
        int timeout = 5;
        int count = 0;
        for (int i = 0; i<256;i++) {
            String ipAddress = baseIP + i;
            try {
                InetAddress address = InetAddress.getByName(ipAddress);
                if (address.isReachable(timeout)) {
                    System.out.println(ipAddress + " is reachable");
                    System.out.println("Host Name: "+address.getHostName());
                    count++;
                }
            } catch (IOException e) {
                System.err.println("Error pinging " + ipAddress + ": " + e.getMessage());

            }
        }
        System.out.print("This many computers are connected: "+count);
    }

}