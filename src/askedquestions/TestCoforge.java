package askedquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestCoforge {
	public static void main(String[] args) {


	        String numberString = "1234";
	        
	        int originalNumber = Integer.parseInt(numberString);
	        
	        List<String> permutations = new ArrayList<>();
	        permute(numberString, 0, numberString.length() - 1, permutations);
	        
	        List<Integer> numbers = new ArrayList<>();
	        for (String perm : permutations) {
	            int permutedNumber = Integer.parseInt(perm);
	            if (permutedNumber > originalNumber) {
	                numbers.add(permutedNumber);
	            }
	        }
	        
	        Collections.sort(numbers);
	        
	        System.out.println("Numbers greater than " + originalNumber + " using the digits of " + numberString + ":");
	        for (int number : numbers) {
	            System.out.println(number);
	        }
	    }
	    
	    public static void permute(String str, int left, int right, List<String> result) {
	        if (left == right) {
	            result.add(str);
	        } else {
	            for (int i = left; i <= right; i++) {
	                str = swap(str, left, i);
	                permute(str, left + 1, right, result);
	                str = swap(str, left, i); // backtrack
	            }
	        }
	    }

	    public static String swap(String str, int i, int j) {
	        char[] charArray = str.toCharArray();
	        char temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	}

