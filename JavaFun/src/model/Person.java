package model;
import java.time.LocalDate;
import java.time.Period;

public class Person {
	//static String firstName = "";
	public String firstName = "";
	public String lastName = "";
	public String gender = "";
	public String birth = "";
	static int age = 0;
	public int weight = 0;
	public int height = 0;
	
	public Person (String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public Person (String lastName, String gender) {	
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void print() {
		if (birth.length() > 7) {
			LocalDate ld = LocalDate.parse(birth);
			LocalDate ldNow = LocalDate.now();
			age = Period.between(ld, ldNow).getYears();
		}
		
		System.out.println(firstName + this.lastName + " " + this.gender + " " + this.birth + " " + age + " " + height + " " + weight);
	}
	
	void familyConvert(String convertFirstName) {
		firstName = convertFirstName;
	}	
}