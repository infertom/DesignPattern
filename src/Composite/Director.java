package Composite;

public class Director {
	private NodeBuilder builder;
	
	public Director(NodeBuilder nodeBuilder){
		builder = nodeBuilder;
	}
	
	public void construct(){
		builder.buildTree();
	}
}
