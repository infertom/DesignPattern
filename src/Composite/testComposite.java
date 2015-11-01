package Composite;

public class testComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXDEPTH = 4;
		NodeBuilder builder = new ConcreteNodeBuilder(MAXDEPTH);
		Director director = new Director(builder);
		
		director.construct();
		Node tree = builder.retrieveInstance();
		tree.mPrint();
	}

}
