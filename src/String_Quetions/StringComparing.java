package String_Quetions;

public class StringComparing {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1== s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(s4));
	}

}
