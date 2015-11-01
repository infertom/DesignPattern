package Decorator;

public class testDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product a = new Product("옵있", "330ml", 2.5);
		Product b = new Product("충관", "230g", 4);
		Client client = new Client();
		client.addProduct(a).addProduct(b);
		
		ComponentInter decorator = new FirstDecorator(new ThirdDecrator(new SecondDecorator(new KernelComponent(client))));
		decorator.mPrint();
	}

}
