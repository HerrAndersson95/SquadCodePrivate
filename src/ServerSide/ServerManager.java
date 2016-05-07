package ServerSide;

import java.net.Socket;
import java.util.ArrayList;

import Util.Document;

public class ServerManager {
	
	private ArrayList<Socket> clients;
	private ArrayList<Document> workSpace;
	
	public ServerManager() {
		clients = new ArrayList<Socket>();
		workSpace = new ArrayList<Document>();
	}
	public void addClient(Socket c){
		clients.add(c);
		System.out.println("CLIENT ADDED in ServerManager");
	}
	
	public void addDocument(String name){
		
	}
	public void removeDocument(String name){
		
	}
	public void getDocument(String name){
		
	}
	public void updateDocument(String name, String content){
		
	}
	
}
