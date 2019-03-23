package model;
import java.util.*;

public class Veterinary{
	public static final int MINI_ROOM = 8;
	private String name;
	//relations
	private ArrayList<Clients>client;
	private MiniRoom[]mini;
	//constructor
	public Veterinary (String name){
		this.name = name;
		client = new ArrayList<Clients>();
		mini = new MiniRoom[MINI_ROOM];

		mini[0] = new MiniRoom (true);
		mini[1] = new MiniRoom (false);
		mini[2] = new MiniRoom (false);
		mini[3] = new MiniRoom (true);
		mini[4] = new MiniRoom (false);
		mini[5] = new MiniRoom (true);
		mini[6] = new MiniRoom (true);
		mini[7] = new MiniRoom (false);


		// mini = new ArrayList<MiniRoom>();
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
	public MiniRoom[]getMini(){
		return mini;
	}
	public void setMini(MiniRoom[]mini){
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

	public String shortInfoClientPet(int indexClient){
		String msg = "";

		msg += client.get(indexClient).shortInfoPet()+"\n";

		return msg;
	}

	// public String createHistoryClinicPet(indexClient, indexPet){
		// String msg = "";

		// msg += client.get(indexclient).createHistoryClinicPet(indexPet);
		// return msg;
	// }

	public void createHistoryClinicPet(int indexClient, int indexPet, String statush, String symptomh, String diagnosish, Dated histoDate1h, Dated histoDate2h){
		if(client != null){
			client.get(indexClient).createHistoryClinicPet(indexPet, statush, symptomh, diagnosish, histoDate1h, histoDate2h);
		}
	}


}
