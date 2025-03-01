package rmi_app;
import java.rmi.*;


public class Server{
	Server(){

	}
	public static void main(String[] args)
	{
		try{
			AdderImp skeleton = new AdderImp();

			Naming.rebind("csit", skeleton);
			System.out.println("Server is Ready...");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}