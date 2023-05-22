package model.animal;

public class Leopard extends Animal implements Predator, Barkable{
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "deer";
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("레오오용");
	}
}

