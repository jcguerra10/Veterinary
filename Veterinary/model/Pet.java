package model;
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
	private Pet(String name, String type, int age, double weight, boolean hospitalizatedBefore, boolean hospitalizatedNow, ClinicHistory histo){
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
	
}