class Counter {
	int count = 0;
}

class Updater {
	void update(Counter counter) {
		counter.count++;
	}
}

public class MainUpdateCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter = new Counter();
		System.out.println("before update:" + myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);
		System.out.println("alter update:" + myCounter.count);
	}

}
