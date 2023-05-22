import model.animal.Crocodile;
import model.animal.Lion;
import model.animal.Predator;
import model.animal.Tiger;
import model.animal.ZooKeeper;

public class MainFeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZooKeeper zk = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		zk.feed(tiger);
		zk.feed(lion);
		zk.feed(crocodile);	
		crocodile.printFood();
	}
}
