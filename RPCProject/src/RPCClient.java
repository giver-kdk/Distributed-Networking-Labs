import java.io.*;
import java.net.*;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter RPC method (e.g., add or sub):");
            String method = sc.nextLine();

            System.out.println("Enter first number:");
            int x = sc.nextInt();
            System.out.println("Enter second number:");
            int y = sc.nextInt();

            Socket socket = new Socket("localhost", 5000);

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            String request = method + "," + x + "," + y;
            dos.writeUTF(request);

            String response = dis.readUTF();
            System.out.println("Server Response: " + response);

            socket.close();
        } catch (IOException e) {
            System.err.println("Client Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
