package ServerSide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerL extends Thread{
	
	private Socket clientIn;
	
	public ServerL(Socket c){
		this.clientIn = c;
	}
	public void run(){
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(clientIn.getInputStream()));
			while(!clientIn.isClosed()){
				String line = in.readLine();
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("ERROR IN ServerL run");
		}
	}
}
