package javaback;

import java.util.HashSet;
import java.util.Set;

public class Person {
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();
		
		personSet.add(new Person("Adam",25));
		personSet.add(new Person("Adam",25));
		
		System.out.println(personSet.size());
	}

}
