package ServerSide;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public Server(int port) throws IOException{
		ServerSocket server = new ServerSocket(port);
		ServerManager sM = new ServerManager();
		
		while(true){
			Socket client = server.accept();
			sM.addClient(client);
			Thread listener = new ServerL(client);
			listener.start();
		}
	}

	public static void main(String[] args) {
		try {
			Server server = new Server(30000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
