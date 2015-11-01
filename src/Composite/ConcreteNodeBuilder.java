package Composite;

import java.util.jar.Attributes.Name;

public class ConcreteNodeBuilder implements NodeBuilder {
	private Node tree;
	private int depth;
	
	public ConcreteNodeBuilder(int depth){
		this.depth = depth;
	}

	public void buildTree(){
		if ( this.depth == 1 ) tree = new LeafNode("Level_1", 1);
		else tree = new RootNode("Level_1", 1);
		tree.addNode(buildLeft(2, "_1"))
			.addNode(buildRight(2, "_2"));
	}
	
	private Node buildLeft(int num, String str){
		Node node;
		if ( num == depth ) node = new LeafNode("Level_" + num + str, num);
		else{
			node = new RootNode("Level_" + num + str, num);
			node.addNode(buildLeft(num + 1, str + "_1"))
				 .addNode(buildRight(num + 1, str + "_2"));
		}
		
		return node;
	}
	
	private Node buildRight(int num, String str){
		Node node;
		if ( num == depth ) node = new LeafNode("Level_" + num + str, num);
		else{
			node = new RootNode("Level_" + num + str, num);
			node.addNode(buildLeft(num + 1, str + "_1"))
				 .addNode(buildRight(num + 1, str + "_2"));
		}
		
		return node;
	}

	@Override
	public Node retrieveInstance() {
		return tree;
	}

}
