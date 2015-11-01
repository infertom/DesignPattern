package Composite;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class RootNode extends Node {
	private String name;
	private int depth;
	private List<Node> subNode;
	
	public RootNode(String name, int depth){
		this.depth = depth;
		this.name = name;
		subNode = new ArrayList<Node>(100);
	}
	
	public String getName(){
		return name;
	}
	
	public Node addNode(Node a){
		subNode.add(a);
		return this;
	}
	
	public Node removeSubNode(int index){
		return subNode.remove(index);
		
	}
	
	public void clearSubNode(){
		subNode.clear();
	}
	
	public Iterator<Node> iterator(){
		return subNode.iterator();
	}
	
	@Override
	public void mPrint() {
		for (int i = 1; i < depth; i++) System.out.print("\t");
		System.out.println(name);
		for ( Node a: subNode ){
			a.mPrint();
		}
	}

}
