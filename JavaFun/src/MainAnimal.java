import model.animal.Animal;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal horse = new Animal();
		
		cat.setName("boby");
		System.out.println(cat.name);
		
		dog.setName("happy");
		System.out.println(dog.name);
		
		horse.setName("quick");
		System.out.println(horse.name);
	}
}
