package rmi_app;
import java.rmi.*;
//import java.rmi.registry.*;
//import java.rmi.server.*; 

public class ClientRMI {
    // Add a constructor
    public ClientRMI(){
    
    }
    public static void main(String[] args){
        try{
            // Get all registry list from Server RMI
//            Registry registry = LocateRegistry.getRegistry();
            // Check for 'csit' registry that we set in ServerRMI
            // Catch the skeleton with the help of registry
            Adder stub = (Adder) Naming.lookup("csit");
            // Access the method of Server from Client side
            int sum = stub.add(2, 3);
            System.out.println("Sum is: " + sum);
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
