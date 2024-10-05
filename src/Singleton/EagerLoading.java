package Singleton;

public class EagerLoading {
	
	private static final EagerLoading singletonObj = new EagerLoading();
	private EagerLoading() {
		
	}
	
	public static EagerLoading instance() {
		return singletonObj;
	}

}
