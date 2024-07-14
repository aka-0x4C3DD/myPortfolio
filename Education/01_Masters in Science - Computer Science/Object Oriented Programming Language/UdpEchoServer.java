import java.net.*;
import java.io.*;

public class UdpEchoServer
{
	static final int port = 9999;
	static final int packetSize = 1024;
	

	public static void main(String args[]) throws SocketException{
		
		DatagramPacket packet;
		DatagramSocket socket;
		byte[] data;    
		int clientPort;
		InetAddress address;
		String str;
		int recvSize;
			
		socket = new DatagramSocket(port);
		
		while(true){
			data = new byte[packetSize];
			
			// Create packets to receive the message		
			packet = new DatagramPacket(data,packetSize);
			System.out.println("to receive the packets or port: "+port);
			
			try{
				socket.receive(packet);		
			}catch(IOException ie){
				System.out.println(" Could not Receive:"+ie.getMessage());
				System.exit(0);
			}
				
			// get data about client in order to echo data back				
			address = packet.getAddress();
			clientPort = packet.getPort();
			recvSize = packet.getLength();
				
			str = new String(data,0,recvSize);
			System.out.println("Message  from "+ address+":"+clientPort+": "+str.trim());
				
			// echo data back to the client				
			packet = new DatagramPacket(data,recvSize,address,clientPort);			
			try{
				socket.send(packet);
					
			}catch(IOException ex){
				System.out.println("Could not Send "+ex.getMessage());
				System.exit(0);
			}
		} 
	} 
}
