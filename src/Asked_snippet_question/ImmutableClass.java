package Asked_snippet_question;

import java.util.HashMap;

public final class ImmutableClass {
	private final int id;
	private final String name;
	private final HashMap<String, Double> salary;
	
	public ImmutableClass(int id, String name,HashMap<String,Double> salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public HashMap<String, Double> getSalary() {
		return salary;
	}
	

	public static void main(String[] args) {
		HashMap<String, Double> h1 = new HashMap<String,Double>();
		h1.put("Dheeraj", 2001.10);
		h1.put("Kumar", 1801.10);
		String s = "Softwar";
		int id = 123;
		
		ImmutableClass obj = new ImmutableClass(id, s, h1);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());	
		

	}

}
