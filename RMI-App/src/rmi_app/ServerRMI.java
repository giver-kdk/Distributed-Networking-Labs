package rmi_app;
//import java.rmi.registry.Registry;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.RemoteException;
import java.rmi.*;
//import java.rmi.registry.*;
//import java.rmi.server.*;               // For 'UnicastRemoteObject'

public class ServerRMI {
    public ServerRMI(){
        
    }
    
    public static void main(String[] args){
        try{
//           AdderRemote obj = new AdderRemote();
           AdderRemote skeleton = new AdderRemote();
           // Exporting interface to client for accessing the skeleton
//           Adder skeleton = (Adder) UnicastRemoteObject.exportObject(obj, 0);
//           Registry registry = LocateRegistry.getRegistry();
           // Bind the registry with skeleton
           Naming.bind("csit", skeleton);
           System.out.println("Server is Ready...");                  // Inform server side program completion
            
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
