package net.mrjohndoe.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


//https://www.youtube.com/watch?v=bWKbdPAovFA&list=PLoW9ZoLJX39Xcdaa4Dn5WLREHblolbji4&ab_channel=AbhayRedkar
public class EchoClient {
	public static void main(String[] args)
	{
		try {
			System.out.println("Client started");
			Socket soc = new Socket("localhost", 9806);
			
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Echo a sentence: ");
			String str = userInput.readLine();
			
			//Access socket's output stream. True is for auto-flush
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			//Send string to output stream
			out.println(str);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
