import model.animal.Tiger;
import model.animal.Animal;
import model.animal.Bouncer;
import model.animal.Leopard;
import model.animal.Lion;

public class MainAnimalBouncer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		Animal animalTiger = new Tiger();
		Animal animalLion = new Lion();
		bouncer.barkAnimal(animalTiger);
		bouncer.barkAnimal(animalLion);
		tiger.bark();
		lion.bark();
		Leopard leopard = new Leopard();
		leopard.bark();
	}

}
