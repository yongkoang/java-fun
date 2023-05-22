package model.animal;

public class Tiger extends Animal implements Predator, Barkable {
	public String getFood() {
		return "chicken";
	}
	
	public void bark() {
		System.out.println("어흥");
	}
	
}
