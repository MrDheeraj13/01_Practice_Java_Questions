package CodingQuest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] ACTUAL = { 1, 2, 3, 4, 5, 6 };
		int[] MINUS = { 9, 4, 6, 8 };
		int[] OUTPUT = { 1, 2, 3, 5 };

//		int l1 = ACTUAL.length;
//		int l2 = MINUS.length;
		
//		for (int i = 0; i < ACTUAL.length - 1; i++) {
//			for(int j =0; j<MINUS.length -1;j++)
//
//			if (ACTUAL[i] != MINUS[j]) {
//				System.out.println(ACTUAL[i]);
//			}
//		}

		String s = "@@@@@@@@@@@@@@@######################%****@@*********************@@";
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i<ch.length-1;i++) {
			if('%' == ch[i]) {
				System.out.println(i);
			}
		}
 		
		
		
		
		
		
	}

}
