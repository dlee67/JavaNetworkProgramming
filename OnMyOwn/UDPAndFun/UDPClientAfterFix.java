/*

	The client sends a packet to the Server, regardless if the Server is
	
	still open or not.

*/
import java.util.*;
import java.net.*;
import java.io.*;

class UDPClientAfterFix{
	
	public static void main(String args[])throws Exception{
		
		InetAddress host = InetAddress.getLocalHost();
		
		Scanner keyboard = new Scanner(System.in);
		
		String userInput, response;
		
		byte[] buffer = new byte[256];
		
		System.out.println("Looking for port.");
		
		//Despite the fact that Socket is a tool to establish a connection,
		//why isn't there IP and port being passed into the line below?
		DatagramSocket link = new DatagramSocket();
		DatagramPacket packetIn, packetOut;
		
		do{
			
			System.out.println("Type in the string input you would like to send.");
			userInput = keyboard.nextLine();
			
			
			packetOut = new DatagramPacket(userInput.getBytes(), userInput.length(), host, 1234);
			link.send(packetOut);
			
		}while(!userInput.equals("stop"));
		
		link.close();
		
	}

}