package java8;


interface Animal{
	void sound();
	
	default void sleep() {
		System.out.println("Sleeping in jungle");
	}
	
	static void print(String s) {
		System.out.println(s);
	}
	
	default void work() {
		print("this is used to print the static block.");
	}
	
	
}

interface Bird{
	default void sleep() {
		System.out.println("Sleeping in nest");
	}
}


public class TestDefaultAndStaticMethodOfJava8 implements Animal,Bird{

	@Override
	public void sound() {
		Animal.print("Bark");
	}
	
	@Override
	public void sleep() {
		Animal.super.sleep();
	}
//	@Override
//	public void sleep() {
//		Bird.super.sleep();
//	}

	static void print(String s) {
		System.out.println("Test Dog");
	}
}
