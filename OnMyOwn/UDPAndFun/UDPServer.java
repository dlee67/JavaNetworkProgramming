/*

	It might be a good thing to keep in mind that soon as I am in the area of the
	
	Computer Networking, I am requesting things from the Kernel.
	
	
	Also, this source will look for port 1234, and send a Datagram to it.
	
*/
import java.util.*;
import java.net.*;
import java.io.*;

//According to the code below, I am sure that this source should be named as a client, but I should ask.
class UDPServer{
	
	public static void main(String args[])throws Exception{
		
		InetAddress host = InetAddress.getLocalHost();
		
		Scanner keyboard = new Scanner(System.in);
		
		String userInput, response;
		
		//Seems like buffers are soley for packet going in.
		byte[] buffer = new byte[256];
		
		System.out.println("Looking for port.");
		
		/*
		
			I think I understand the idea of UDP now, you don't establish a connection, you just leave a 
			
			port open.
		
		*/
		//Thus, the line below means: "I have a port 1234 open, send any packets you'd like."
		//DatagramSocket link = new DatagramSocket(1234);
		DatagramSocket link = new DatagramSocket();
		
		DatagramPacket packetIn, packetOut;
		
		do{
			
			System.out.println("Type in the string input you would like to send.");
			//Scanner object could also work as point of suspend.
			userInput = keyboard.nextLine();
			
			
			/*
			
				Datagram is sent to the specified host and the port through the arguments.
			
			*/
			packetOut = new DatagramPacket(userInput.getBytes(), userInput.length(), host, 1234);

			//Even so, Sockets are needed to establish a connection.
			link.send(packetOut);
			
		}while(!userInput.equals("stop"));
		
		link.close();
		
	}

}