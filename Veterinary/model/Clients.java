package model;
import java.util.*;
//attributes 
public class Clients{
	private String name;
	private int id;
	private String address;
	private long phone;
	//relations
	private ArrayList<Pet>pet;
	//constructor
	public Clients(String name, int id, String address, long phone){
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		pet = new ArrayList<Pet>();
	}
	//get set
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	public void setId(){
		this.id = id;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(){
		this.address = address;
	}
	
	public long getPhone(){
		return phone;
	}
	public void setPhone(long phone){
		this.phone = phone;
	}
	public ArrayList getPet(){
		return pet;
	}
	public void setPet(ArrayList <Pet>pet){
		this.pet = pet;
	}
	
	//methods
	
	public void addPet(Pet newPet){
		pet.add(newPet);
	}
	
	public String infoClientWithPet(){
		String msg = "";
		
		msg += "EL NOMBRE DEL CLIENTE ES: "+name+"\n";
		msg += "SU IDENTIDICACION ES: "+id+"\n";
		msg += "LA DIRECCION: "+address+"\n";
		msg += "SU TELEFONO: "+phone+"\n";
		msg += "--------------------------------------------\n\n";
		if(pet.isEmpty()==false){
			for(int i=0;i<pet.size(); i++){
				msg += pet.get(i).infoPet();
			}
		}
		return msg;
	}
	
	
	
	
}