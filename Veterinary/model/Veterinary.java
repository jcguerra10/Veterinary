package model;
import java.util.*;

public class Veterinary{
	private String name;
	//relations
	private ArrayList<Clients>client;
	private ArrayList<MiniRoom>mini;
	//constructor
	public Veterinary (String name){
		this.name = name;
		client = new ArrayList<Clients>();
		
		MiniRoom r1 = new MiniRoom (true);
		MiniRoom r2 = new MiniRoom (false);
		MiniRoom r3 = new MiniRoom (false);
		MiniRoom r4 = new MiniRoom (true);
		MiniRoom r5 = new MiniRoom (false);
		MiniRoom r6 = new MiniRoom (true);
		MiniRoom r7 = new MiniRoom (true);
		MiniRoom r8 = new MiniRoom (false);
		
		
		mini = new ArrayList<MiniRoom>();
	}
	//get set
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public ArrayList<Clients> getClient(){
		return client;
	}
	public void setClient(ArrayList <Clients>client){
		this.client = client;
	}
	public ArrayList<MiniRoom> getMini(){
		return mini;
	}
	public void setMini(ArrayList <MiniRoom>mini){
		this.mini = mini;
	}
	
	//methods
	public String addClient(Clients newClient){
		String msg = "";
		client.add(newClient);
		msg += "SE HA CREADO EL NUEVO CLIENTE";
		return msg;
	}

	public String addPettoClient(Pet newPet, int index){
		String msg = "";
		client.get(index).addPet(newPet);
		msg += "SE HA CREADO EL NUEVO ANIMAL";
		return msg;
	}
	
	public String infoClientPet(){
		String msg = "";
		if(client.isEmpty() == false){
			for(int i=0;i<client.size(); i++){
				msg += client.get(i).infoClientWithPet();
			}
		}
		return msg;
	}
	
	public String shortInfoClient(){
		String msg = "";
		if(client.isEmpty() == false){
			for(int i=0;i<client.size(); i++){
				msg += i + ")" + client.get(i).getName()+"\n";
			}
		}
		return msg;
	}

}