package Decorator;

public class FirstDecorator extends OtherDecoratorAb {

	public FirstDecorator(ComponentInter d) {
		super(d);
	}

	@Override
	public void mPrint() {
		System.out.println("\t           东北大学超市");
		System.out.println("----------------------------------");
		component.mPrint();
	}

}
