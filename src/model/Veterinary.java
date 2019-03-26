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

		mini[0] = new MiniRoom (true, null, null);
		mini[1] = new MiniRoom (true, null, null);
		mini[2] = new MiniRoom (true, null, null);
		mini[3] = new MiniRoom (true, null, null);
		mini[4] = new MiniRoom (true, null, null);
		mini[5] = new MiniRoom (true, null, null);
		mini[6] = new MiniRoom (true, null, null);
		mini[7] = new MiniRoom (true, null, null);


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

	// public void createRooms(MiniRoom room1, MiniRoom room2, MiniRoom room3, MiniRoom room4, MiniRoom room5, MiniRoom room6, MiniRoom room7, MiniRoom room8){
		// mini[0] = room1;
		// mini[1] = room2;
		// mini[2] = room3;
		// mini[3] = room4;
		// mini[4] = room5;
		// mini[5] = room6;
		// mini[6] = room7;
		// mini[7] = room8;
	// }
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
	
	public String namePetSpecific(int indexClientDA, int indexPetDA){
		String msg ="";
		msg += client.get(indexClientDA).getPetName(indexPetDA);
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

	public void addMedicine(int iClient, int iPet, Medicine newMed){
		if(client!=null){
			client.get(iClient).addMedicine(iPet, newMed);
		}
	}

	// public String getHistoClinicSpecific(int indexClientFH, int indexPetFH){
		// String msg = "";
		// if(client!=null){
			// msg += client.get(indexClientFH).histoClinic(indexPetFH);
		// }
		// return msg;
	// }
	//este
	// public String getHistoClinicSpecific(int indexClientFH, int indexPetFH){
		// String msg = "no";
			// msg += client.get(indexClientFH).histoClinic(indexPetFH);
		// return msg;
	// }

	// public void addHistoClinicToMini(String histoClinicDesired){
		// boolean exit=false;
		// int i = 0;
		// while(exit==true&&i<mini.length){
			// if(mini[i].getAvailable()!=false){
				// mini[i].setAvailable(false);
				// mini[i].setHistoClinicMT(histoClinicDesired);
				// exit = true;
			// }else{
				// i++;
			// }
		// }
	// }

	public String showHistoInMiniRooms(){
		String msg = "";

		for(int i=0;i<mini.length;i++){
			//if(mini[i]!=null){
				msg += mini[i].getHistoClinic()+"\n";
			//}

		}
		return msg;
	}
	public Pet getPetToMini(int indexClientFH, int indexPetFH){
		return client.get(indexClientFH).getPet(indexPetFH);
	}

	public String addPetToMini(MiniRoom miniWithPet){
		String msg = "";
		int exit=0;
		int i = 0;
		while(exit==0&&i<mini.length){
			if(mini[i].getAvailable()==true){
				mini[i]=miniWithPet;
				exit = 1;
				msg += "SE AGREGO EL ANIMAL AL CUARTO";
			}else{
				i++;
			}
		}
		return msg;
	}

	public String nose(){
		String msg = "";
		for(int i=0;i<mini.length;i++){
			msg += mini[i].getMiniRoom();
		}
		return msg;
	}

	public double calculatePriceOfPet(int indexClientCP, int indexPetCP, int dayT, int monthT, int yearT){
		double tot = 0.0;

		tot += client.get(indexClientCP).calculatePriceOfPet(indexPetCP, dayT, monthT, yearT);

		return tot;
	}
	
	public String dischargeAPet(String nameOfDischarge, MiniRoom miniDischarge){
		String msg = "";
		for(int i=0;i<mini.length; i++){
			if(mini!=null){
				if(mini[i].showNamePet().equals(nameOfDischarge)){
					mini[i]=miniDischarge;
					msg += "SE HA DADO DE ALTA AL ANIMAL";
				}
			}
		}
		return msg;
	}


}
