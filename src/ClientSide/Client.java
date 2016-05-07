package ClientSide;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private Socket server;
	
	public Client(String address, int port) throws UnknownHostException, IOException{
		this.server = new Socket(address, port);
		System.out.println("Connected to server in Client");
		
		Thread writer = new ClientW(server);
		writer.start();
	}
	
	public void sendMsg(String msg){
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

	public static void main(String[] args) {
		try {
			//localhost 
			Client client = new Client("127.0.0.1", 30000);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
