package Decorator;

public class SecondDecorator extends OtherDecorator {
	public SecondDecorator(ComponentInter d){
		super(d);
	}
	
	
	@Override
	public void mPrint() {
		component.mPrint();
		System.out.println("**********************************");
		System.out.println("\t14天购物保证。货真价实");
		System.out.println("\t东大超市电话83688888");
		System.out.println("**********************************");
	}

}
/*
**********************
14天购物保证。货真价实
东大超市电话83688888
**********************

*/