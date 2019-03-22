package model;
import java.util.*;
//
public class Pet{
	public static final String DOG = "perro";
	public static final String CAT = "gato";
	public static final String BIRD = "ave";
	public static final String OTHER = "otro";
	//
	private String name;
	private String type;
	private int age;
	private double weight;
	private boolean hospitalizatedBefore;
	private boolean hospitalizatedNow;
	//
	private ClinicHistory histo;
	//
	public Pet(String name, String type, int age, double weight, boolean hospitalizatedBefore, boolean hospitalizatedNow){
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.hospitalizatedBefore = hospitalizatedBefore;
		this.hospitalizatedNow = hospitalizatedNow;
		this.histo = histo;
	}
	//get set
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public int getAge(){
		return age;
	}
	public void setType(int age){
		this.age = age;
	}
	
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public boolean getHospitalizatedBefore(){
		return hospitalizatedBefore;
	}
	public void setHospitalizatedBefore(boolean hospitalizatedBefore){
		this.hospitalizatedBefore = hospitalizatedBefore;
	}
	
	public boolean getHospitalizatedNow(){
		return hospitalizatedNow;
	}
	public void setHospitalizatedNow(boolean hospitalizatedNow){
		this.hospitalizatedNow = hospitalizatedNow;
	}
	
	public ClinicHistory getHisto(){
		return histo;
	}
	public void setHisto(ClinicHistory histo){
		this.histo = histo;
	}
	
	//methods
	
	public String infoPet(){
		String msg = "";
		if(type.equals(DOG)){
			msg += "EL NOMBRE DEL ANIMAL TIPO "+DOG+" ES: "+name+"\n";
		}else if(type.equals(CAT)){
			msg += "EL NOMBRE DEL ANIMAL TIPO "+CAT+" ES: "+name+"\n";
		}else if(type.equals(BIRD)){
			msg += "EL NOMBRE DEL ANIMAL TIPO "+BIRD+" ES: "+name+"\n";
		}else {
			msg += "EL NOMBRE DEL ANIMAL TIPO "+type+" ES: "+name+"\n";
		}
		msg += "SU EDAD ES: "+age+"\n";
		msg += "PESA: "+weight+"\n";
		if(hospitalizatedBefore == true){
			msg += "EL ANIMAL HA ESTADO HOSPITALIZADO ANTES \n";
		}else{
			msg += "EL ANIMAL NO HA ESTADO HOSPITALIZADO ANTES\n";
		}
		if(hospitalizatedNow == true){
			msg += "EL ANIMAL ESTA HOSPITALIZADO \n";
		}else{
			msg += "EL ANIMAL ESTA HOSPITALIZADO \n";
		}
		msg += "--------------------------------------------\n\n";
		if(histo != null){
			msg += "HISTORIA CLINICA: \n";
			msg += histo.infoClinicHistory();
		}
		return msg;
	}
	
	public String getClinicHisotry(){
	
		return histo.infoClinicHistory();
	}
	
	// public Medicine addMedicine(newMed){
		
	// }
}