package inheritance;

public class Teacher extends Person{
	
	int teacherID;
	
	public Teacher() {
		
	}
	
//	public Teacher(String name, int age, int teacherID) {
//		this.name=name;
//		this.age=age;
//		this.teacherID=teacherID;
//	}
	public Teacher(int teacherID) {
		super("Eve", 28);
		this.teacherID = teacherID;
	}

	public void teach(String subject) {
    System.out.println("teacher is teaching");
}
}
