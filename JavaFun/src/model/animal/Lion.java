package model.animal;

public class Lion extends Animal implements Predator, Barkable {
	public String getFood() {
		return "cow";
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("으로렁");
	}
}
