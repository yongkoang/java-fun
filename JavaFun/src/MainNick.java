
public class MainNick {
	
	void sayNick(String nick) {
		if ("foo".equals(nick)) {
			return;
		}
		System.out.println("My nick is "+nick+".");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainNick mn = new MainNick();
		mn.sayNick("angel");
		mn.sayNick("foo");
	}

}
