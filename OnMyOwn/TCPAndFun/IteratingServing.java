/*

	This program was written under the assumption that
	
	no error will occur, and exception is not needed.

*/
import java.util.*;
import java.io.*;
import java.net.*;

class IteratingServing{
	
	public static void main(String args[])throws Exception{
		
		String take;
		
		System.out.println("Opening a port.");
		
		ServerSocket ss = new ServerSocket(7777);
		Socket s = ss.accept();
		System.out.println("Connection established.");
		
		DataInputStream input = new DataInputStream(s.getInputStream());
		
		/*
			
			I wrote this under the assumption that readUTF() will hang
			until there is something to read.
		
			05:54PM
			06/23/17
			Seems like I was correct?
		
		*/
		while(true){
			
			take = input.readUTF();
			
			if(take.equalsIgnoreCase("stop")){
				
				break;
				
			}
			
			System.out.println(take);
			
		}
		
		s.close();
		
	
	}
	
}