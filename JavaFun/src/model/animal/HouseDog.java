package model.animal;

public class HouseDog extends Dog {
	public HouseDog(String name) {
		this.setName(name);
	}
	
	public HouseDog(int type) {
		if (type == 1) {
			this.setName("yorkshire");
		} else if (type == 2) {
			this.setName("bulldog");
		} else {
			this.setName("others");
		}
	}
	
	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	public void sleep(int hour) {
		if (hour <= 1 ) { 
			System.out.println(this.name+ " zzz in house for " +hour+ " hour");
		} else {
			System.out.println(this.name+ " zzz in house for " +hour+ " hours");
		}
	}
}
