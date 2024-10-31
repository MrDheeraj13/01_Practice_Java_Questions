package StaticBlock;

public class EmployeeStatic {
	int id;
	String name;
	static String company = "tcs"; 
	
	public EmployeeStatic(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+company);
	}

	public static void main(String[] args) {
		EmployeeStatic obj = new EmployeeStatic(101, "Dheeraj");
		obj.display();
		EmployeeStatic obj2 = new EmployeeStatic(102, "abc");
		obj2.display();
		EmployeeStatic obj3 = new EmployeeStatic(103, "raj");
		obj3.display();
		

	}

}
