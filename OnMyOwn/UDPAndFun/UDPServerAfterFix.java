/*

	Server receives a packet from the Server, and terminates.

*/
import java.util.*;
import java.net.*;
import java.io.*;

class UDPServerAfterFix{
	
	public static void main(String args[])throws Exception{
		
		byte[] buffer = new byte[256];
		
		System.out.println("Opening a port.");
		
		DatagramSocket link = new DatagramSocket(1234);
		DatagramPacket packetIn = new DatagramPacket(buffer, buffer.length);
		link.receive(packetIn);
		
		String translator = new String(packetIn.getData(), 0, packetIn.getLength());
		System.out.println(translator);
	
		link.close();
	
	}
	
}