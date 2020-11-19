package men;


public class MentorManagement {
	
	public static void main(String args[]) {
		
		Mentorship m1 = new Mentorship("Adam", 12346);
		Mentorship m2 = new Mentorship("Eve",34567);
		
		Mentorship.school = "CyberTek";
		
	
	int i=45;
	assignMentorByiD(i);
	assignMentor(m1);
	assignMentorByiD(m2.getiD());
	}
	
	public static void assignMentorByiD (int iD) {
System.out.println( "the mentor with id " + iD);
		
	}
	
public static void assignMentor(Mentorship mentor) {
	System.out.println( "metor's name " + mentor.getName() + " mentor's Id:  " + mentor.getiD());
		
		
	}

}
