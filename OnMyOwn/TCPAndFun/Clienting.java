/*

	For this design, I will be having the client 
	
	sending the stream of string.

*/
import java.util.*;
import java.io.*;
import java.net.*;

class Clienting{
	
	public static void main(String args[])throws Exception{
		
		InetAddress local = InetAddress.getLocalHost();
		
		Socket s = new Socket(local, 7777);
		
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
	
		//This thing sends the stream of String.
		out.writeUTF("Hello Server.");
		
		DataInputStream in = new DataInputStream(s.getInputStream());
		
		s.close();
	
	}
	
}