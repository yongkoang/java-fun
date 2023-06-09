import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Person;

/*
 * person.txt
 * 김 길동 남 1973-02-21 180 90
이 영순 여 1994-02-10 168 46
 */
public class MainPersonFileLineReader {
	//static ArrayList<Person> persons = new ArrayList<>();	
	static List<Person> persons = new ArrayList<>();	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		BufferedReader br = new BufferedReader(new FileReader("D:\\Projects\\person\\data\\person.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			String[] person = line.split(" ");
			
			int height = Integer.parseInt(person[4]);
			int weight = Integer.parseInt(person[5]);			
			
			Person p = new Person(person[0], person[1], person[2], person[3], height, weight);
			persons.add(p);
		}
		br.close();
		
		System.out.println(persons.size());
		/*
		for (Person person : persons) {
			person.print();
		}
		*/
		
		// 가장 키가 큰 사람은 ?
		int maxHeight = 0;
		String name = "";
		for (Person person : persons) {
			if (maxHeight < person.height ) {
				maxHeight = person.height;
				name = person.firstName + person.lastName;
			}			
		}
		System.out.println(name + " max height " + maxHeight );
		
		// 여자들은?
		String womanName = "";
		for (Person person : persons) {
			if ("여".equals(person.gender)) {				
				womanName = womanName + person.firstName + person.lastName + " ";				
			}			
		}	
		
		System.out.println(womanName + "들은 여자다." );
		
		//persons.get(0).personMarriged(persons.get(persons.size()-1));
		
		//키순으로 출력한다.
		Collections.sort(persons, new PersonHeightComparator());
		System.out.println("Sorted height!");
		for (Person person : persons) {
			person.print();		
		}
		
		// 나이순으로 출력한다.
		System.out.println("Sorted age!");
		Collections.sort(persons, new PersonAgeComparator());
		for (Person person : persons) {
			person.print();
		}
		
		// 남자 중 가장 나이 많은 남자와 가장 나이 어린 여자가 결혼한다.
		// 가장 나이 많은 남자
		System.out.println("Love and Marrige!");
		Person manHighAge = null;
		int maxAge = 0;		
		for (Person person : persons) {
			if ("남".equals(person.gender) && maxAge < person.age ) {
				manHighAge = person;
				maxAge = person.age;
			}			
		}
		
		Person womanLowAge = null;
		int minAge = 100;		
		for (Person person : persons) {
			if ("여".equals(person.gender) && minAge > person.age ) {
				womanLowAge = person;
				minAge = person.age;
			}			
		}		
		
		womanLowAge.love(manHighAge);
		manHighAge.personMarriged(womanLowAge);
		
		
	}
}

class PersonAgeComparator implements java.util.Comparator<Person> {
	public int compare(Person a, Person b) {
		return b.getAge() - a.getAge();
	}	
}

class PersonHeightComparator implements java.util.Comparator<Person> {
	public int compare(Person a, Person b) {
		return b.height - a.height;
	}
}