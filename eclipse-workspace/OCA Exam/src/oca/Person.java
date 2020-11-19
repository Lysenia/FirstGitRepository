package oca;

//Test61
public class Person {
	
	String name;
	int age = 25;
	
	public Person(String name, int age) {
//		this();
//		Person(name);
		this(name);
		this.age = age;
	}
	
	public Person(String name) {

		setName(name);
	

}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
