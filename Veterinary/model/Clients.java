package model;
//attributes 
public class Clients{
	private String name;
	private int id;
	private String address;
	private int phone;
	//relations
	private ArrayList<Pet>pet;
	//constructor
	public Clients(String name, int id, String address, int phone){
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
	
	public int getPhone(){
		return phone;
	}
	public void setPhone(){
		this.phone = phone;
	}
	
	//methods 
	
	
	
	
}