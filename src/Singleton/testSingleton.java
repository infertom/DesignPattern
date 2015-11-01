package Singleton;


public class testSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClientForLazySingleton lazyClientA = ClientForLazySingleton.getClient();
		ClientForLazySingleton lazyClientB = ClientForLazySingleton.getClient();
		System.out.println(lazyClientA + "  " + lazyClientB);
		
		ClientForEagerSingleton eagerClientA = ClientForEagerSingleton.getClient();
		ClientForEagerSingleton eagerClientB = ClientForEagerSingleton.getClient();
		System.out.println(lazyClientA + "  " + lazyClientB);
		
	}

}
