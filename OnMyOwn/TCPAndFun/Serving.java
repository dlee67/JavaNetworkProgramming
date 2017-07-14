//In the end, I am guessing I will have to use the 
//DataOutputStream
//DataInputStream
import java.util.*;
import java.io.*;
import java.net.*;

class Serving{
	
	public static void main(String args[])throws Exception{
		
		ServerSocket ss = new ServerSocket(7777);
		Socket s = ss.accept();
		
		System.out.println("Connection established.");
		
		DataInputStream input = new DataInputStream(s.getInputStream());
		
		//This thing receives the stream of String.
		System.out.println(input.readUTF());
		
		s.close();
		
	
	}
	
}