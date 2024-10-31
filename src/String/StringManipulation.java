package String;

public class StringManipulation {
	
//	Reverse a String
	public static String reverse(String s) {
	StringBuilder revString = new StringBuilder();
	for(int i=s.length()-1; i>=0; i--) {
		revString.append(s.charAt(i));
	}
	return revString.toString();
	}
	
//	Check for Palindrome String
	public static boolean palindrom(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start < end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
			
//	Find All Permutations of a String
	public static void permutation(String s, String result) {
		if(s.length() == 0) {
			System.out.println(result);
			return;
		}
		for(int i=0; i<s.length()-1;i++) {
			char ch =s.charAt(i);
			String ros = s.substring(0, i)+s.substring(i+1);
			permutation(ros, result+ch);
		}
		
	}
	
//	Check if Two Strings are Anagrams
//	Longest Substring Without Repeating Characters
//	Count Occurrences of a Substring
//	String Rotation
//	Longest Common Prefix
//	Find All Substrings of a String
	
	public static void main(String[] args) {

//		System.out.println(reverse("Dheeraj"));
//		System.out.println(palindrom("madam"));
//		permutation("test", "");
		

	
	}

}
