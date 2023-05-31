package model;
import java.time.LocalDate;
import java.time.Period;

public class Person {
	//static String firstName = "";
	public String firstName = "";
	public String lastName = "";
	public String gender = "";
	public String birth = "";
	public int age = 0;
	public int weight = 0;
	public int height = 0;
	
	public Person (String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public Person (String firstName, String lastName, String gender, String birth, int height, int weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birth = birth;
		this.height = height;
		this.weight = weight;
		
		if (birth.length() > 7) {
			LocalDate ld = LocalDate.parse(birth);
			LocalDate ldNow = LocalDate.now();
			age = Period.between(ld, ldNow).getYears();
		}
	}
	
	public Person (String lastName, String gender) {	
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void print() {
		System.out.println(firstName + this.lastName + " " + this.gender + " " + this.birth + " " + age + " " + height + " " + weight);
	}
	
	void familyConvert(String convertFirstName) {
		firstName = convertFirstName;
	}
	
	public void think() {
		System.out.println(this.firstName + " thinking!");
	}
	
	public void personMarriged(Person p) {
		System.out.println(this.firstName + this.lastName + " congraturate marrige with " + p.firstName + p.lastName);
	}
	
	public void love(Person p) {
		System.out.println(this.firstName + this.lastName + " love " + p.firstName + p.lastName);
	}
	
	public int getAge() {
		return age;
	}
}