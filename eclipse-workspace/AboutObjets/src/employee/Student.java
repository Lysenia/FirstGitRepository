package employee;

public class Student {

	public Student() {
		this("No One");
		System.out.println("Message from Constructor");
	}
	
	public Student(String name) {
		System.out.println("name of student: " + name);
}
}
