
public class MainVarMethodPrint {
	
	void varTest(int a) {
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 1;
		MainVarMethodPrint mv = new MainVarMethodPrint();
		mv.varTest(a);
		System.out.println(a);
		
	}

}
