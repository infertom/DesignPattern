package Decorator;

public class KernelComponent implements ComponentInter {
	private Client client;
	
	public KernelComponent(Client client){
		this.client = client;
	}
	
	@Override
	public void mPrint() {
		for (Product p: client){
			System.out.println("\t" + p.getName() + " " + p.getSize() + "     \t" + p.getMomey());
		}
		System.out.println("");
		System.out.println("\t合计(人民币)    \t" + client.getSum());
		
	}

}

/**
 东北大学超市
----------------------------------
可乐330ml     2.5
面包 230g      4

合计(人民币)    6.5

*/