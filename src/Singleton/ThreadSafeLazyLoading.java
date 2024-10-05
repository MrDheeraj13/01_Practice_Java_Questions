package Singleton;

/*
 * making thread safe singleton class using double checking locking pattern
*/
public class ThreadSafeLazyLoading {
	private static volatile ThreadSafeLazyLoading singletonObj = null;
	
	private ThreadSafeLazyLoading() {
		
	}
	
	public static ThreadSafeLazyLoading instance() {
		if(singletonObj == null) {
			synchronized (ThreadSafeLazyLoading.class) {
				if(singletonObj == null) {
					return singletonObj = new ThreadSafeLazyLoading();
				}
				
			}
		}
		
		return singletonObj;
		
	}

}
