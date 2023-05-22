
public class MainSum {
	int sum(int a, int b) {
		return a + b;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		
		MainSum mainSum = new MainSum();
		int c = mainSum.sum(a, b);
		System.out.println(c);
	}

}
