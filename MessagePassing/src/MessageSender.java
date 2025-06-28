import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MessageSender {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6000);
            System.out.println("Connected to receiver.");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter message to send: ");
            String message = sc.nextLine();

            out.println(message);
            System.out.println("Message sent successfully.");

            socket.close();
        } catch (IOException e) {
            System.err.println("Sender Error: " + e.getMessage());
        }
    }
}
