import model.Man;
import model.Person;


public class MainPersonPrint {
	static Person marrigeMan;
	
	public static void main(String[] args) {	
		//System.out.println("Family Name : " + Person.firstName);
		printPersonKim("길동", "남");
		
		Person p1 = new Person("손", "나은", "여");
		p1.birth = "1994-02-10";
		p1.height = 168;
		p1.weight = 46;
		p1.print();
		
		Person p2 = new Person("안", "유진", "여");
		p2.birth = "2003-09-01";
		p2.height = 172;
		p2.weight = 48;
		p2.print();
		
		printMarrige(marrigeMan, p1);
	}
	
	static void print (String name, String gender) {
		System.out.println(name + " " + gender);
	}
	
	static void printPersonKim (String lastName, String gender){
		//Person.firstName = "김";
		//Person p = new Person("김", lastName, gender);
		Man m = new Man("김", lastName);
		m.birth = "1973-02-21";
		m.height = 180;
		m.weight = 90;
		marrigeMan = m;
		m.print();
	}
	
	static void printPersonLee (String lastName, String gender){
		//Person.firstName = "이";
		Person p = new Person("이", lastName, gender);
		p.print();
	}
	
	static void printPersonOh (String lastName, String gender){
		//Person.firstName = "오";
		Person p = new Person("오", lastName, gender);
		p.print();
	}
	
	static void printMarrige (Person p1, Person p2) {
		System.out.println(p1.firstName + p1.lastName + " Congraturating marrige with " + p2.firstName + p2.lastName);
	}
}
