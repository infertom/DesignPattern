package Decorator;

public class Product {
	private String name;
	private String size;
	private double momey;
	
	public Product(String name, String size, double momey){
		this.name = name;
		this.size = size;
		this.momey = momey;
	}
	
	public double getMomey(){
		return this.momey;
	}
	
	public String getSize(){
		return this.size;
	}
	
	public String getName(){
		return this.name;
	}
}
