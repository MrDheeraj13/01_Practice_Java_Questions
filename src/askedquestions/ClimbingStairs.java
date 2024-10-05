package askedquestions;

public class ClimbingStairs {
	
	static int count(int num) {
		if(num <= 1) {
			return num;
		}else {
			return count(num-1)+count(num-2);
		}
		
	}
	static int ways(int n) {
		return count(n+1);
	}

	public static void main(String[] args) {
		int n =4;
		System.out.println("Number of way:"+ways(n));

	}

}
