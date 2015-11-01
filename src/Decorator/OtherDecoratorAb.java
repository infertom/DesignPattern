package Decorator;

public abstract class OtherDecoratorAb implements ComponentInter {
	ComponentInter component;
	
	public OtherDecoratorAb(ComponentInter d){
		component = d;
	}

	@Override
	public abstract void mPrint();

}
