package overriding;

public class StudentAttend {
	
	public static void main(String args[]) {
		
		Student s = new Student("Adam", 123);
		
		s.attendClass();
		
		OnlineStudent os = new OnlineStudent("Eve",123,4566);
		os.attendClass();
		
		LocalStudent l = new LocalStudent("Jana",123,222);
		l.attendClass();
	}

}
