package abc;

public class OnlineStudent extends Student{
	
	String name;
	int studentID;

	public OnlineStudent(String name, int studentID) {
		super(name, studentID);
	}
	@Override
    public void createClass() {
	System.out.println(" attending online");
	}
}

