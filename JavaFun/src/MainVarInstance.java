
public class MainVarInstance {
	int a;
	
	void varTest(MainVarInstance mvi) {
		mvi.a++;
	}

	public static void main(String[] args) {		
		MainVarInstance mv = new MainVarInstance();
		mv.a = 1;
		mv.varTest(mv);
		System.out.println(mv.a);		
	}

}
