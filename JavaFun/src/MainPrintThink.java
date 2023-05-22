import model.Think;

public class MainPrintThink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Think think = new Think();
		for (int i=0; i<think.subject.length; i++) {
			System.out.println(think.subject[i]);
		}
		
		for (String subject : think.subject) {
			System.out.println(subject);
		}
	}

}
