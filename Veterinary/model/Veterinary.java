package model;
import java.util.ArrayList;

public class Veterinary{
	private String name;
	//
	private ArrayList<clients>client;
	private miniRoom mini;
	//
	public Veterinary (String name, miniRoom mini){
		this.name = name;
		this.mini = mini;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	
	public miniRoom getMini() {
		return mini;
	}
	public void setMini(miniRoom mini){
		this.mini = mini;
	}
	
	//
	
}