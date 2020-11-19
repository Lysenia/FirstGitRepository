package men;

public class MentorAction {
	
	public static void main(String args[]) {
		
		int num1 = 5;
		
	increaseNumber(num1);
	System.out.println("Value after method call " + num1);
	
Mentorship m1 = new Mentorship(15);
//changeMentor(m1);
changeMentorId(m1);
System.out.println("MentorId outside " + m1.getiD());



	}
	
	static void changeMentorId(Mentorship m) {
		m.setId(20);
		
		System.out.println("Mentor Id inside "
				+ "" + m.getiD());
	}

	
	static void changeMentor(Mentorship m) {
		m = new Mentorship(10);
		System.out.println("Mentor Id inside is " + m.getiD());
		
	}
	static void increaseNumber(int value) {
		value = value +5; 
		System.out.println("new value  " + value);
	}
}
