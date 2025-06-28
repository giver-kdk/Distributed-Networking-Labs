package pkg01_tcp;
import java.net.*;
import java.io.*;

public class tcp_server {
    public static void main(String[] s) throws Exception{
        try{
            ServerSocket server = new ServerSocket(1234);
            Socket client = server.accept();
            System.out.println(client + " Client is connected.");
            
            DataInputStream input = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            String message =(String) input.readUTF();
            System.out.println(message);  
            out.writeUTF("Hello Client");
            
            input.close();
            client.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
