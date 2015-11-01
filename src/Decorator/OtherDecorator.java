package Decorator;

public abstract class OtherDecorator implements ComponentInter {
	ComponentInter component;
	
	public OtherDecorator(ComponentInter d){
		component = d;
	}

	@Override
	public abstract void mPrint();

}
