package overriding;

public class LocalStudent extends Student{

	
private int seatID;
	
	public LocalStudent(String name, int StudentId,int seatID) {
		super(name, StudentId);
		this.seatID = seatID;
		
	}
	
	void attendClass() {
		System.out.println(getName() + "  attending in-class" + seatID);
	}
}


