import java.net.*;
import java.io.*;

public class UdpEchoClient {
	static final int packetSize = 1024;
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws UnknownHostException, SocketException{
		DatagramSocket socket; 
		DatagramPacket packet; 
		InetAddress address;  
		String messageSend; 
		String messageReturn; 
		byte[] data;
		int port;
		
		try {
			System.out.print("Enter server name: ");
			address = InetAddress.getByName(stdin.readLine());
			System.out.print("Enter server port: ");
			port = Integer.parseInt(stdin.readLine());
			
			while (true) {
				System.out.print("Enter message for the server or press enter to exit: ");
				messageSend = stdin.readLine();	
				if(messageSend.length() == 0){
					System.exit(0);
				}
			
				socket = new DatagramSocket();			
				data = messageSend.getBytes();		
				packet = new DatagramPacket(data,data.length,address,port);
				socket.send(packet);
			
				//packet is reinitialized to use it for recieving
				data = new byte[packetSize];
				packet = new DatagramPacket(data,data.length);
				socket.receive(packet);
				messageReturn = new String(data,0,packet.getLength());
				System.out.println("Message Returned : "+	messageReturn);
			} 
		}catch(IOException iee){
			System.out.println("Could not receive :	"+iee.getMessage() );
			System.exit(0);
		}				
	} 
}
