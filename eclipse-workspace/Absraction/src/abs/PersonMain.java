package abs;

import java.util.Scanner;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Adam",32);
		System.out.println(p1);
		System.out.println(new Person("Adam",32));
		
		Object o1 = new Person("Eve",31);
		System.out.println(o1.toString());
		
		Person p2 = (Person) o1;
		System.out.println(p2.name);
//		Scanner s = (Scanner)o1;
		
		Object o2 = (Person) p1;
		p1.getAge();
		
		
		Person person = new Person("Vira",45);
		System.out.println(person.getAge());
		
		
		Engineer eng = new Engineer("Siri",55,234);
		eng.design("June");
		
//		Duck d = Duck(eng); - will not compile, unrelated fields
		
Person person2 = (Engineer)eng;
		
		Person person3 = new Engineer("Jane",12,345);
		
		
		Engineer c1 = (Engineer) person3;
		c1.design("Rocket");
		
		Engineer c3 = (Engineer) o2;
		
		c3.design("airplane");
		
Person p11 = (Person)o1;
		
		
		Person engeneer = new Engineer("Halil",30,678);
		System.out.println(engeneer.name);
		
		Object o4 = new Engineer("John",45,576);
	
		
		
		
//		Object obj = new ();
	}

}
