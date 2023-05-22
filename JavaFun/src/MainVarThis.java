
public class MainVarThis {
	int a;
	
	void varTest() {
		this.a++;
	}

	public static void main(String[] args) {		
		MainVarThis mv = new MainVarThis();
		mv.a = 1;
		mv.varTest();
		System.out.println(mv.a);		
	}
}
