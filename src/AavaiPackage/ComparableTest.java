package AavaiPackage;

import java.util.Arrays;

class Pair implements Comparable<Pair>{
	String fname;
	String lname;
	
	public Pair(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String toString() {
		return "( "+fname+", "+lname+" )";
	}
	
	@Override
	public int compareTo(Pair a ) {
		
		if(this.fname.compareTo(a.fname) !=0 ) {
			return this.fname.compareTo(a.fname);
		}
		else {
			return this.lname.compareTo(a.lname);
		}
		
	}
	
}

public class ComparableTest {
	
	public static void main(String[] args) {
		int n = 4;
		Pair arr[] = new Pair[n];
		arr[0] = new Pair("raj", "kashup");
        arr[1] = new Pair("rahul", "singh");
        arr[2] = new Pair("reshmi", "dubey");
        arr[3] = new Pair("rahul", "jetli");
        
        Arrays.sort(arr);
        
        for (Pair p : arr) {
			System.out.println(p);
		}
	}

}
