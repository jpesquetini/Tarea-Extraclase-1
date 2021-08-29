package code;

import java.io.IOException;

public class Client1 {
   
    public static void main(String[] args) {
        Clients client1 = new Clients();
        try {
            client1.startConnection("192.168.100.11", 8080);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
