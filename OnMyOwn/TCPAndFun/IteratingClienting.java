/*

	This program was written under the assumption that
	
	no error will occur, and exception is not needed.

*/
import java.util.*;
import java.io.*;
import java.net.*;

class IteratingClienting{
	
	public static void main(String args[])throws Exception{
		
		Scanner keyboard = new Scanner(System.in);
		String send;
		
		InetAddress local = InetAddress.getLocalHost();
		Socket s = new Socket(local, 7777);
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
	
		System.out.println("Connection Established.");
	
		while(true){
	
			System.out.println("Requesting Input: ");
			send = keyboard.nextLine();
	
			//This thing sends the stream of String.
			out.writeUTF(send);
	
			if(send.equalsIgnoreCase("stop")){
				
				break;
				
			}
	
		}
		
		DataInputStream in = new DataInputStream(s.getInputStream());
		
		s.close();
	
	}
	
}