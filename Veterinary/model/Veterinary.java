package model;
import java.util.*;

public class Veterinary{
	private String name;
	//relations
	private ArrayList<Clients>client;
	private ArrayList<MiniRoom>mini;
	//constructor
	public Veterinary (String name, MiniRoom mini){
		this.name = name;
		client = new ArrayList<Clients>();
		mini = new ArrayList<MiniRoom>();
	}
	//get set
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	//methods
}