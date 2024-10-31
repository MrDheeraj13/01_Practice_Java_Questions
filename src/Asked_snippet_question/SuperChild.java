package Asked_snippet_question;
//==================================================
class Super {
	public void m() {
		System.out.println("Super");
	}

}

class SubClass extends Super {
	public void m() {
		System.out.println("SubClass");
	}

	public static void main(String[] args) {
		Super s = new SubClass();
		s.m();
	}
}

//============================================================
//class SuperChild{
//	public static void main(String[] args) {
//		String a  = "ABC";
//		a = "PQR";
//		System.out.println(a);
//	}
//}



