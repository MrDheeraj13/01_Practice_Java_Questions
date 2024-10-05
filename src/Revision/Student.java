package Revision;

public class Student {
	
	int roll;
	String name;
	static String collage = "IET";
	
	Student(int roll, String name ){
		this.roll = roll;
		this.name = name;
	}

	void display() {
		System.out.println(roll+" "+name+" "+collage);
	}
	public static void main(String[] args) {
		Student s = new Student(111,"Dheeraj");
		s.display();

	}

}
