package rmi_app;
import java.rmi.*;


class Client{
	Client(){

	}
	public static void main(String[] args)
	{
		try{
			Adder stub = (Adder) Naming.lookup("csit");

			int sum = stub.add(2, 3);
			System.out.println("Sum is: ", sum);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}