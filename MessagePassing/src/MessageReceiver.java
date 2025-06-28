import java.io.*;
import java.net.*;

public class MessageReceiver {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Receiver is waiting for message...");

            Socket socket = serverSocket.accept();
            System.out.println("Connection established with sender.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = in.readLine();

            System.out.println("Received message: " + message);

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.err.println("Receiver Error: " + e.getMessage());
        }
    }
}
