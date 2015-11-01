package Singleton;


public class ClientForEagerSingleton {
	private static ClientForEagerSingleton client = new ClientForEagerSingleton();
	
	private ClientForEagerSingleton() {
		
	}
	
	public static ClientForEagerSingleton getClient(){
		return client;
	}
}
