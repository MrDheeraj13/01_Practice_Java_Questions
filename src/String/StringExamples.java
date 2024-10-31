package String;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringExamples {

	public static void main(String[] args) {
		String base = "Hello there";
		String remove = "e";
//		System.out.println(base.replace(remove,""));
//		===================================
		String s = "Sachine";
		s = s.concat(" Tendulker");
//		System.out.println(s);
//		===================================
		StringBuffer s1 = new StringBuffer("Sachin");
		StringBuffer s2 = new StringBuffer("Tendulker");
		StringBuffer s3 = new StringBuffer(" ji");
		
		System.out.println(s1.append(s2));
		String s4 = String.format("%s%s%s",s1,s2,s3);
		System.out.println(s4);
		
		String s5 = String.join("", s1,s2,s3);
		System.out.println(s5);
		
		StringJoiner str = new StringJoiner(",");
		str.add("A");
		str.add("B");
		System.out.println(str.toString());
		
		List<String> ls = Arrays.asList("abc","xyz","pqr","def");
		String strlist = ls.stream().collect(Collectors.joining(","));
		System.out.println(strlist);
		
		System.out.println(s1.substring(0,6));
		
		String str1="Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = str1.replace("Java", "Kafka");
		System.out.println(str1.replace("a", ""));
		System.out.println(replaceString);
		StringBuffer str2 = new StringBuffer(str1);
		System.out.println(str2.reverse());
		
		
		

	}

}
