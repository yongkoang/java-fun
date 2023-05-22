package model.animal;

public class Bouncer {
	public void barkAnimal(Animal animal) {
		if (animal instanceof Tiger) {
			System.out.println("어흥");
		} else if (animal instanceof Lion) {
			System.out.println("으르렁");
		}
	}	 
}
