package code;

import java.io.*;
import java.net.Socket;

public class Clients {
    
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader input;

    public void startConnection(String ipAdress, Integer port) throws IOException {
        clientSocket = new Socket(ipAdress, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("Client connected succesfully");
        
    }
}
