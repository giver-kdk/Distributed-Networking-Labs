package rmi_app;
import java.rmi.server.*;
import java.rmi.*;

/**
 *  Implement the 'Adder' interface
 */
public class AdderRemote extends UnicastRemoteObject implements Adder {
//    Create a constructor
    AdderRemote() throws RemoteException{
        super();
    }
//    Implement the interface method
    public int add(int a, int b)
    {
        return a + b;
    }
}
