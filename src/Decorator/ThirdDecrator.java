package Decorator;

public class ThirdDecrator extends OtherDecorator {
	public ThirdDecrator(ComponentInter d){
		super(d);
	}
	
	@Override
	public void mPrint() {
		component.mPrint();
		System.out.println("\t      货物售出概不退款");
		System.out.println("\t保护环境，请勿随意丢弃");
	}

}

/*
货物售出概不退款
保护环境，请勿随意丢弃

*/