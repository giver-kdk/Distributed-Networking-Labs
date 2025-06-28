import java.io.*;
import java.net.*;

public class RPCServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("RPC Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());

                String request = dis.readUTF(); // Example format: add,5,3

                String[] parts = request.split(",");
                String method = parts[0];
                int result = 0;

                switch (method) {
                    case "add":
                        int a = Integer.parseInt(parts[1]);
                        int b = Integer.parseInt(parts[2]);
                        result = a + b;
                        break;
                    case "sub":
                        a = Integer.parseInt(parts[1]);
                        b = Integer.parseInt(parts[2]);
                        result = a - b;
                        break;
                    default:
                        dos.writeUTF("Invalid RPC method");
                        clientSocket.close();
                        continue;
                }

                dos.writeUTF("Result: " + result);
                clientSocket.close();
            }

        } catch (IOException e) {
            System.err.println("Server Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
