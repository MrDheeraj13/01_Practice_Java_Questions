package BasicQuestions;

public class DefaultOutput {
	String str;//class variable
	int i;
	float f;
	long l;
	char ch;
	short sh;
	byte bt;

	public static void main(String[] args) {

		String localVariable;//The local variable localVariable may not have been initialized throwing error
		
		DefaultOutput op = new DefaultOutput();
		System.out.println(op.str);
//		System.out.println(localVariable);
//		This will cause a compile-time error: "local variable may not have been initialized"
		
		System.out.println(op.i);
		System.out.println(op.f);
		System.out.println(op.l);
		System.out.println(op.ch);
		System.out.println(op.sh);
		System.out.println(op.bt);
		
		
		String s1 = "Welecome";
//		 s1 = "Hello";
		String s3 = "Welecome";
		String s4 = new String("Welecome");
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
	}

}
