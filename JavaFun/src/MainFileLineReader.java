import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Person;

/*
 * person.txt
 * 김 길동 남 1973-02-21 180 90
이 영순 여 1994-02-10 168 46
 */
public class MainFileLineReader {
	static ArrayList<Person> persons = new ArrayList<>();

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
			
			System.out.println(line);
		}
		br.close();
		
		System.out.println(persons.size());
		for (Person personList : persons) {
			personList.print();
		}
		
		Person p1 = (Person) persons.get(0);
		Person p2 = (Person) persons.get(2);
		p1.personMarriged(p2);
	}
}
