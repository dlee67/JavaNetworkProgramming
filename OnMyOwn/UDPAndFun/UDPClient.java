/*

	Client receives from the Server, and does not sending anything back.

*/
import java.util.*;
import java.net.*;
import java.io.*;

class UDPClient{
	
	public static void main(String args[])throws Exception{
		
		byte[] buffer = new byte[256];
		
		/*
		
			Leave a port open so that DatagramPackets can be dropped off.
		
		*/
		System.out.println("Opening a port.");
		
		DatagramSocket link = new DatagramSocket(1234);
		
		DatagramPacket packetIn = new DatagramPacket(buffer, buffer.length);
		
		link.receive(packetIn);
		
		String translator = new String(packetIn.getData(), 0, packetIn.getLength());
		
		System.out.println(translator);
	
		link.close();
	
	}
	
}