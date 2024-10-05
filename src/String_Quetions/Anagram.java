package String_Quetions;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length() != s2.length())
		{
			return false;
		}else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
		
		
	}
	
	public static void main(String[] args) {
		String temp1 = "Dheeraj";
		String temp2 = "Kumar";
		System.out.println("Both Strings are anagram :"+isAnagram(temp1,temp2)); 
		

	}

}
