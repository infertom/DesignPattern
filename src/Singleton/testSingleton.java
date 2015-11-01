package Singleton;


public class testSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClientForLazySingleton lazyClientA = ClientForLazySingleton.getClient();
		ClientForLazySingleton lazyClientB = ClientForLazySingleton.getClient();
		System.out.println("Client for LazySingleton");
		System.out.println(lazyClientA);
		System.out.println(lazyClientB);
		
		System.out.println("-----------------------");
		
		ClientForEagerSingleton eagerClientA = ClientForEagerSingleton.getClient();
		ClientForEagerSingleton eagerClientB = ClientForEagerSingleton.getClient();
		System.out.println("Client for EagerSingleton");
		System.out.println(eagerClientA);
		System.out.println(eagerClientB);
	}

}
