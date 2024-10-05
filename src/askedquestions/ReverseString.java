package askedquestions;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Learn Fast";
		
		/*
		 * 1. First, convert String to character array by using the built in Java String class method toCharArray().
		 *  
		 * 2. Then, scan the string from end to start, and print the character one by one.
		 */
		
		char ch[] = s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
//		=======================================================
		/*
		 * Using built in reverse() method of the StringBuilder class: String class does
		 * not have reverse() method, we need to convert the input string to
		 * StringBuilder, which is achieved by using the append method of StringBuilder.
		 * After that, print out the characters of the reversed string by scanning from
		 * the first till the last index.
		 */
		StringBuilder input = new StringBuilder();
		input.append(s);
		input.reverse();
		System.out.println(input);
// 
	}

}
