package ClientSide;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientW extends Thread{
	
	private Socket server;
	
	public ClientW(Socket s){
		this.server = s;
	}
	
	public void run(){
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new BufferedOutputStream(server.getOutputStream()), true);
			
			while(!server.isClosed()){
				String line = in.readLine();
				out.println(line);
			}
		} catch (IOException e) {
			System.out.println("ERROR in ClientW in run");
		}
	}

}
