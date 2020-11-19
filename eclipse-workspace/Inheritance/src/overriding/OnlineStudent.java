package overriding;

public class OnlineStudent extends Student {

	private int webinarID;
	
	public OnlineStudent(String name, int StudentId, int webinarID) {
		super(name, StudentId);
		this.webinarID = webinarID;
		
	}
	
	void attendClass() {
		System.out.println(getName() + "  attending online using webinar  " + webinarID);
	}
}
