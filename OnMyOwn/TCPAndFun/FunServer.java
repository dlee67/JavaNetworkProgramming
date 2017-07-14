/*

	Server closing the connection 
	
	before any data was able to be sent.

*/
import java.util.*;
import java.io.*;
import java.net.*;

class FunServer{
	
	public static void main(String args[])throws Exception
	{
		
		ServerSocket ss = new ServerSocket(1234);
		Socket link = ss.accept();
		System.out.println("Connection has been established");
		
		//Input stream
		Scanner reader = new Scanner(link.getInputStream());
		//Output stream
		PrintWriter writer = new PrintWriter(link.getOutputStream());
		Scanner keyboard = new Scanner(System.in);
		
		String str = keyboard.nextLine();
		
		//writer.write(str);
		writer.println(str);
		
		// Immediately send all data in buffer
		writer.flush();
		
		// Tell the thread to sleep for a second
		// Thread.sleep(1000);
		/*
		while(true){
			
			System.out.println("Please, enter your input.");
			send = keyboard.nextLine();
		
			if(send.equalsIgnoreCase("stop")){
				break;
			}
			wrter.println(send);
		}
		*/
		link.close();	
		
	}	
}