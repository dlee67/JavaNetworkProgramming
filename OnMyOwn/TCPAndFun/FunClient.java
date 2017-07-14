/*

	yeah, I don't know, I really don't

*/
import java.util.*;
import java.io.*;
import java.net.*;

class FunClient{
	
	public static void main(String args[])throws Exception
	{
		
			String output;
		
			InetAddress local = InetAddress.getLocalHost();
			Socket link = new Socket(local, 1234);
			System.out.println("Connection Successful.");
			
			
			Scanner reader = new Scanner(link.getInputStream());
			PrintWriter writer = new PrintWriter(link.getOutputStream());
			
			String str = reader.next();
			System.out.println(str);
			
			/*
			while(true){
				
				output = writer.nextLine();
				
				if(output.equals("close")){
					break;
				}
				
				System.out.println(output);
				
			}
			
			
			*/
			link.close();
	}
}