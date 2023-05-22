
public class MainVarMethodReturn {
	
	int varTest(int a) {
		a++;
		return a;
	}

	public static void main(String[] args) {
		int a = 1;
		MainVarMethodReturn mv = new MainVarMethodReturn();
		a = mv.varTest(a);
		System.out.println(a);		
	}
}
