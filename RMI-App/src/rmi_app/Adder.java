package rmi_app;
import java.rmi.*;

/**
 *
    Create interface extending 'Remote' interface
 */
public interface Adder extends Remote{
    public int add(int x, int y) throws RemoteException;
}
