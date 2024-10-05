package polumorphism;

class Base {
    static void display() {
        System.out.println("Base show");
    }
}

class Derived extends Base {
    static void display() {
        System.out.println("Derived display");
    }
}

public class TestOverride {

	public static void main(String[] args) {
		Base obj = new Derived();
		obj.display();
		Derived obj2 = new Derived();
		obj2.display();

	}

}
