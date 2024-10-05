package String_Quetions;
import java.util.*;
import java.lang.*;

class Singleton{
	private static Singleton singleton_instance = null;
	public String s;
	private Singleton() {
		s = "This is string part of singltone class";
	}
	
	public static Singleton Singleton() {
		if(singleton_instance == null) {
			singleton_instance = new Singleton();
		}
	}
}


public class TestSingleton {

	public static void main(String[] args) {
		Singleton x = Singleton.Singleton();
		Singleton y = Singleton.Singleton();
		
//		change var of x
		x.s = (x.s).toUpperCase();
		System.out.println("String from x is -->"+x.s);
		System.out.println("String from x is -->"+y.s);
		System.out.println("\n");
		
		y.s = (y.s).toLowerCase();
		System.out.println("String from x is -->"+x.s);
		System.out.println("String from x is -->"+y.s);

	}

}
