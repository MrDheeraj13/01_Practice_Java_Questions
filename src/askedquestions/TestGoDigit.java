package askedquestions;

public class TestGoDigit {

	public static void main(String[] args) {
		String str = "Dheeraj is Java Developer";
//		String vowels = "aeiouAEIOU";
//		
//		Map<Character, Long> placeValueOfVowels = str.chars().mapToObj(c ->(char)c)
//		.filter(c -> vowels.indexOf(c) != -1)
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//		System.out.println(placeValueOfVowels);
		
		char[] ch = str.toLowerCase().toCharArray();
		for(int i =0; i<ch.length-1;i++ ) {
			if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u' ) {
				System.out.println(ch[i]+" = "+ i);
			}
		}
	}

}
