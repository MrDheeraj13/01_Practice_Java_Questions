package Singleton;

public class LazyLoading {
	private static volatile LazyLoading singletoneObj = null;
	private LazyLoading() {
		
	}
	public static LazyLoading instance() {
		if(singletoneObj == null) {
			return singletoneObj = new LazyLoading(); 
		}
		return singletoneObj;
	}

}
