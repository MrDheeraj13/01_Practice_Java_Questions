package askedquestions;

import java.util.Arrays;

//	Write a program to find the longest common prefix string amongst an array of strings.
//	If there is no common prefix, return an empty string "".
//	Example 1:
//	Input: strs = ["flower","flow","flight"]
//	Output: "fl"


public class TestNTTData1 {
	
	    public static void main(String[] args) {
	        String[] strs = {"flower", "flow", "flight"};
	        System.out.println("Longest common prefix: " + commomChar(strs));
	    }
	    	    
	    public static String commomChar(String[] str ) {
	    	if(str == null || str.length == 0) {
	    		return "";
	    	}
	    	String first = str[0];
	    	String lastChar = str[str.length -1];
	    	int i = 0;
	    	while(first.charAt(i) == lastChar.charAt(i)) {
	    		i++;
	    	}
	    	
	    	return first.substring(0, i);
	    }

	}

