
public class MainVar {
	
	void varTest(int a) {
		a++;		
	}

	public static void main(String[] args) {
		int a = 1;
		MainVar mv = new MainVar();
		mv.varTest(a);
		System.out.println(a);
		
	}

}
