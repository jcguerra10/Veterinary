package model;
import java.util.*;
//attributes
public class MiniRoom{
	private boolean available;
	private String histoClinic;
	//
	private Pet pet;
	//
	public MiniRoom(boolean available, Pet pet, String histoClinic){
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
	
	public String getHistoClinic(){
		return histoClinic;
	}
	public void setHistoClinic(String histoClinic){
		this.histoClinic = histoClinic;
	}
	// methods
	// public String getPetClinicHisto(){
		// String msg = "";
		// if(pet != null)
			// msg += pet.getClinicHistoryPet();
		// return msg;
	// }
	// public void setHistoClinicMT(String histoClinicDesired){
		// setHistoClinic(histoClinicDesired);
	// }
	
	public String getMiniRoom(){
		String msg = "";
	
		msg += "========================== CUARTO ==========================\n";
		if(available == false){
			msg += "DISPONIBILIDAD: NO HAY DISPONIBILIDAD \n";
		}else{
			msg += "DISPONIBILIDAD: SI HAY DISPONIBILIDAD \n";
		}
		if(pet!=null){
			msg += pet.getClinicHistoryPet()+"\n";
		}else{
			msg += "NO HAY ANIMAL O NO EXISTE ALGUNA HISTORIA CLINICA\n";
		}
		return msg;
	}
	
	
	
	
	
}
