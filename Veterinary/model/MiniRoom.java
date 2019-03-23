package model;
import java.util.*;
//attributes
public class MiniRoom{
	private boolean available;
	//
	private Pet pet;
	//
	public MiniRoom(boolean available){
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

	// methods
	// public String getPetClinicHisto(){
		// String msg = "";
		// if(pet != null)
			// msg += pet.getClinicHistoryPet();
		// return msg;
	// }

}
