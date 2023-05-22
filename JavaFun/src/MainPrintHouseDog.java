import model.animal.HouseDog;

public class MainPrintHouseDog {
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("happy");
		
		houseDog.sleep(0);
		houseDog.sleep(1);
		houseDog.sleep(2);
		
		HouseDog houseDogType = new HouseDog(1);
		System.out.println(houseDogType.name);
	}
}
