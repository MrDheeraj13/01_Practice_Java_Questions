package askedquestions;

import java.util.HashSet;
import java.util.stream.Stream;

public class FindMistak {
	
	public static boolean stringConcatination(String s) {
		return s.toLowerCase().matches(".*[aeiou]*.");
		
	}

	public static void main(String[] args) {

//		System.out.println(stringConcatination("Temp"));
		
//		String s1 = "abc";
//		String s2 = "abc";
//
//		System.out.println("s1 == s2 is:" + s1 == s2);
		
//		String s3 = "JournalDev";
//		int start = 1;
//		char end = 5;
//
//		System.out.println(s3.substring(start, end));
//		
//		HashSet shortSet = new HashSet();
//
//		for (short i = 0; i < 100; i++) {
//	    shortSet.add(i);
//	    shortSet.remove(i - 1);
//	}
//
//	System.out.println(shortSet.size());
		
//		String str = null;
//		String str1="abc";
//
//		System.out.println(str1.equals("abc") | str.equals(null));
		
		Stream.iterate(new int[] {0,1}, f -> new int[] { f[1],f[0]+f[1]})
		.limit(30 )
		.map(f -> f[0])
		.forEach(System.out::println);
		
		
	}

}
