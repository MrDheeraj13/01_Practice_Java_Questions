package askedquestions;

public class RearangeOrder {

	public static void main(String[] args) {
		 int[]  a = {1,2,3,4,5,6,7};
	        int temp = 0, i = 0;
	        
	        for(i = 0 ; i < a.length-1; i+=2)
	        {
	            temp = a[i];
	            a[i] = a[i+1];
	            a[i+1] = temp;
	        }
	        for(i = 0 ; i < a.length; i++) {
	        	System.out.print(a[i]+" ");
	        }

	}

}
