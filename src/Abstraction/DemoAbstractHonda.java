package Abstraction;

abstract class DemoBike{
	abstract void run();
	final void gear() {
		System.out.println("This bike has 5 gear!");
	}
	
}

public class DemoAbstractHonda extends DemoBike {
	
	void run() {
		System.out.println("This just demo bike for honda!");
	}
	
	public static void main(String[] args) {
		DemoBike db = new DemoAbstractHonda();
		db.run();
		db.gear();
	}

}
