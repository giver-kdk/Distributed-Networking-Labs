package rmi_app;
import java.rmi.*;

interface Adder extends Remote{
	int add(int a, int b) throws RemoteException;
}