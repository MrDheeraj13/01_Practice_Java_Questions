package Asked_snippet_question;

interface A {
	default void test(){
             System.out.println("Interface A");
        }
}

interface B {
	default void test(){
             System.out.println("Interface B");
        }
}

class InterfaceQuestion implements A, B{


public void test(){
	A.super.test();
	B.super.test();
	
}
public static void main(String[] args){
	InterfaceQuestion cObj = new InterfaceQuestion();
     cObj.test();
		     
}
}
