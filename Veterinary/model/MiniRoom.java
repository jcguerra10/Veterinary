package model;
//attributes
public class MiniRoom{	
	private boolean available;
	//
	private Pet pet;
	//
	public MiniRoom(boolean available, Pet pet){
		this.available = available;
		this.pet = pet;
	}
	//get set
	public boolean getAvailable(){
		return available;
	}
	public void setAvailable(boolean available){
		this.available = available;
	}
	
	public Pet getPet(){
		return pet;
	}
	public void setPet(Pet pet){
		this.pet = pet;
	}
}