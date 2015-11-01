package Composite;

import java.util.Iterator;

public abstract class Node implements Iterable<Node>{
	public Node addNode(Node a){
		return null;
	}
	
	public Node removeSubNode(int index){
		return null;
	}
	
	public void clearSubNode(){
		
	}
	
	public Iterator<Node> iterator(){
		return null;
	}
	
	public abstract void mPrint();
	public abstract String getName();
}
