package StaticBlock;

class Test{
	static void show() {
		System.out.println("this is another class.");
	}
}

public class StaticMethodExmpl {
	static void display() {
		System.out.println("Hello World");
	} 
	
	public static void main(String[] args) {
		display();
		Test.show();
	}

}
