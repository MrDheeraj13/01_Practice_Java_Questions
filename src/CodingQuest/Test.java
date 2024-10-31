package CodingQuest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static int[] minusArray(int[] ACTUAL,int[] MINUS  ) {
		
		Set<Integer> set = new HashSet<>();
		for(int num:MINUS) {
			set.add(num);
		}
		
		return Arrays.stream(ACTUAL).filter(n ->!set.contains(n)).toArray();		
		
	} 
	

	public static void main(String[] args) {
		int[] ACTUAL = { 1, 2, 3, 4, 5, 6 };
		int[] MINUS = { 9, 4, 6, 8 };
//		int[] OUTPUT = { 1, 2, 3, 5 };

 		int[] OUTPUT = minusArray(ACTUAL,MINUS);
 		System.out.println(Arrays.toString(OUTPUT));

 		String s = "@@@@@@@@@@@@@@@######################%****@@*********************@@";
 		
 		char[] ch = s.toCharArray();
 		
 		for(int i = 0; i<ch.length-1;i++) {
 			if('%' == ch[i]) {
 				System.out.println(i);
 			}
 		}
  		
		
		
		
		
		
	}

}
