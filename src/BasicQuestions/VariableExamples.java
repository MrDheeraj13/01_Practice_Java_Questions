package BasicQuestions;

class VariableExamples {
	int instanceVariable; //Instance variable
	static int classVar = 20;
	
	public VariableExamples(int var){	
		instanceVariable = var;
	}
	
	public void test() {
	int localVar = 30;	
	}
	public static void main(String[] args) {
		VariableExamples obj = new VariableExamples(10);
		System.out.println(obj);
		

	}

}
