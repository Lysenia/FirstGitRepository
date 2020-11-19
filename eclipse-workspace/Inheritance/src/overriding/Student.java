package overriding;

public class Student {
	
	private String name;
	private int StudentID;
	
	public Student() {
		
	}
	
	public Student(String name, int StudentID) {
		this.name = name;
		this.StudentID = StudentID;
	}
	
	public String getName() {
		return name;
	}
	
	void attendClass() {
		System.out.println(name + "  attending class ");
	}

}
