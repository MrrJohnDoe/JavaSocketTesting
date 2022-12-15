package net.mrjohndoe.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Waiting for clients...");
		
		try {
			//port number, binds socket to port	
			ServerSocket ss = new ServerSocket(9806);
			//accepts client connections, returns socket object once connected
			Socket soc = ss.accept();
			System.out.println("Connection established.");
			
			//Read from scoket's input stream (the one the server creates upon connection
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = in.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(str.toUpperCase());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
