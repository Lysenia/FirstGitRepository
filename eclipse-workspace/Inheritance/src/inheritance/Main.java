package inheritance;

public class Main {
	
	public static void main(String args[]) {
		Person p = new Person("Adam",32);
		Teacher t = new Teacher (29);
//		Teacher t = new Teacher("Eve", 12,29);
		p.eat();
		t.eat();
		t.teach("Math");
		
		System.out.println("Teacher's name is  " + t.name + "  teacher's ID is  " + t.teacherID );
		System.out.println("Teacher's name is  " + p.name );
		
		
	}

}
