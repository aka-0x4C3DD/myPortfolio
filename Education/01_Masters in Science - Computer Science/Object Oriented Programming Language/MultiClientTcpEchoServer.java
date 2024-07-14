import java.net.*;
import java.io.*;
import java.util.*;

public class MultiClientTcpEchoServer
{
	public static void main(String[] args)
	{
		int port = 9090;
		
		try {
	   	ServerSocket server = new ServerSocket(port);

		
			while(true) {
				System.out.println("Waiting for clients on port " + port);
				Socket client = server.accept();
				ConnectionHandler handler = new ConnectionHandler(client);			
				handler.start();
			}
		} catch(Exception ex) {
			System.out.println("Connection error: "+ex);
		}
	}
}

class ConnectionHandler extends Thread {
	private Socket client;
	BufferedReader reader;
	PrintWriter writer;
	
	static int count;
	
	public ConnectionHandler(Socket client) {
		this.client = client;
       	System.out.println("Got connection from "+client.getInetAddress()+":"+client.getPort());
		count++;
		System.out.println("Active Connections = " + count);	
	}
	
	public void run() {
		String message=null;
		
		try {
			reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			writer = new PrintWriter(client.getOutputStream());
		
			writer.println("Welcome to my server");
			writer.flush();
			
			message = reader.readLine(); 
			
			while (!(message == null || message.equalsIgnoreCase("exit"))) {
				writer.println(message);
				writer.flush();
				
				message = reader.readLine();
			}
			
		   client.close();
			count--;
			System.out.println("Active Connections = " + count);	
				
		} catch (Exception ex) {
			count--;
			System.out.println("Active Connections = " + count);	
		}
	}	
 }
