package polumorphism;

class CustomeException extends Exception{
	public CustomeException(String s)
	{
		super(s);
	}
}

class Parent {

	// Constructor of Parent class
	// Not throwing any checked exception
	Parent()
	{

		// Print statement whenever parent class
		// constructor is called
		System.out.println("parent class constructor");
	}
}

//Class 2
//Child class
public class Child extends Parent {

	// Constructor of child class
	Child()
	{

		// Print statement whenever child class
		// constructor is called
		System.out.println("child class constructor");
	}

	// main driver method
	public static void main(String[] args)
	{

		// Creating object of child class inside main()
		Child child = new Child();
	}
}
