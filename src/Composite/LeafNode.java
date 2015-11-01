package Composite;

public class LeafNode extends Node {
	private String name;
	private int depth;
	
	public LeafNode(String name, int depth){
		this.depth = depth;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public void mPrint() {
		for (int i = 1; i < depth; i++) System.out.print("\t");
		System.out.println(name);
	}

}
