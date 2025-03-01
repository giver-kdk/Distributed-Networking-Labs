package rmi_app;
import java.rmi.*;
import java.rmi.server.*;

class AdderImp extends UnicastRemoteObject implements Adder{
	AdderImp() throws RemoteException
	{
		super();
	}
	public int add(int a, int b)	// Function with Input
	{
		int sum = a + b;			// Process
		return sum;					// Output
	}
}