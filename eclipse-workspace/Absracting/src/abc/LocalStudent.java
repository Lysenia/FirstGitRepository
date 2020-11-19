package abc;

// concrete class
// in concrete class abstract methods should be overridden and adding body;

// non abstract class can extend abstract class
//  abstract class can extend non abstract class
// abstract class can extend another abstract class


public class LocalStudent extends Student  {
	
	public LocalStudent(String name, int studentID) {
		super(name, studentID);
		// TODO Auto-generated constructor stub
	}


	public static void main(String args[]) {
		
	}

	
	public  void createClass() {
	System.out.println(" attending class");
	}

}
