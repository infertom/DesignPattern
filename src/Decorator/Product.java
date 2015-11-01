package Decorator;

public class Product {
	private String name;
	private String size;
	private double money;
	
	public Product(String name, String size, double momey){
		this.name = name;
		this.size = size;
		this.money = momey;
	}
	
	public double getMoney(){
		return this.money;
	}
	
	public String getSize(){
		return this.size;
	}
	
	public String getName(){
		return this.name;
	}
}
