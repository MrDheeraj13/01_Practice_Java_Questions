package String_Quetions;


interface Addable{
	int add(int a, int b);
}

public class TestEpam{

	
	public static void main(String[] args) {

		Addable ad1 = (a,b)->(a+b);
		System.out.println(ad1.add(20, 10));
		
		Addable ad2 = (a,b)->(a+b);
		System.out.println(ad2.add(11, 12));
		
		
		
		
	}


}
