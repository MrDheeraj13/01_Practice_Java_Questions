package Asked_snippet_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Base {
    public void show() {
       System.out.println("Base::show() called");
    }
}
 
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
 
public class Main {
	
    public static void main(String[] args) {
		
        Base b = new Derived();;
        b.show();
        
//        Complex c = new Complex(10, 15);
//        System.out.println(\"Complex number is \" + c);
//        o/p=>  10+i15
//        Print the list in inceasing order later start with "a" ?
        		List<String> myList = Arrays.asList("apple", "orange", "banana");

        		List<String> list = myList.stream().sorted().collect(Collectors.toList());
        		System.out.println(list);
        		
//        		Employee e1=new Employee("Nikhil");
//        		Employee e2=new Employee("Nikhil");
//        		Sop(e1.equals(e2));//true
        		
        		StringBuffer e1=new StringBuffer("Nikhil");
        		StringBuffer e2=new StringBuffer("Nikhil");
        		System.out.println(e1.equals(e2));//false
        		System.out.println(e1.toString().equals(e2.toString()));//true

        
    }
}