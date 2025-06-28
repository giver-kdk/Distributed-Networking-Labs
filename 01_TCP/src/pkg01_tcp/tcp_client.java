package pkg01_tcp;
import java.io.*;
import java.net.*;

public class tcp_client {
     public static void main(String[] s) throws Exception{
        try{
            Socket socket = new Socket("localhost",1234);
            System.out.println(socket + " Server is connected.");
            
            // Message sent to server
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            // Write output in UTF character encoding format
            out.writeUTF("Hello Server");     
            String message = in.readUTF();
            System.out.println(message);
            
            out.flush();
            out.close();
            socket.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
