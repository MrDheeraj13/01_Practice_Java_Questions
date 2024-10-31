package String;


final class ImmutableClass {
	private final String name;
	private final int age;
	
	public ImmutableClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		String name = "Dheeraj";
		int age = 28;
		ImmutableClass obj = new ImmutableClass(name, age);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}

}
