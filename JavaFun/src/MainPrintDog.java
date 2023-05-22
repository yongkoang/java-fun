import model.animal.Dog;

public class MainPrintDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
	}
}
