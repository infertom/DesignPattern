package Decorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client implements Iterable<Product>{
	private List<Product> obj;
	
	public Client(){
		obj = new ArrayList<Product>(100);
	}
	
	public Client addProduct(Product product){
		obj.add(product);
		return this;
	}
	
	public double getSum(){
		double sum = 0;
		for ( Product p: obj){
			sum += p.getMomey();
		}
		return sum;
	}

	@Override
	public Iterator<Product> iterator() {
		return obj.iterator();
	}
}
