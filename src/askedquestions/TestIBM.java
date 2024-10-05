package askedquestions;


interface Fun{
	public void run();
}

public class TestIBM implements Fun{

	@Override
	public void run() {
		System.out.println("runing !");
		
	}
	
//	()->System.out.println("runing !");
	
	public static void main(String[] args) {
//	Test ts = new Test();
	Fun fn = ()->System.out.println("runing !");
	
	}


}
