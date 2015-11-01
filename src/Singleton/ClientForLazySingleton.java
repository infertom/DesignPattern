package Singleton;


public class ClientForLazySingleton {
	private static ClientForLazySingleton client = null;

	private ClientForLazySingleton() {
		
	}
	
	public static ClientForLazySingleton getClient(){
		if ( client == null ) {
			synchronized ( ClientForLazySingleton.class ){
				if ( client == null ){
					client = new ClientForLazySingleton();
				}
			}
		}
		
		return client;
	}
	
	
}
