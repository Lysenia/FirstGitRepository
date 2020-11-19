package office;

public class ScrumTeamMember {

	public String teamName = "Cybertek";
	protected static int capacity = 5;
	String tickets = "Login story";
	private int realWorkingHours = 5;
	
	public void work() {
		System.out.println("scrum team member " + teamName + "  capacity "+
	capacity + " working on " + tickets);
		joinStanUpMeeting();
	}
	
	public static void joinStanUpMeeting() {
		System.out.println("Scrum team member is attending daily stand up meeting");
	}
	
	
	
}
