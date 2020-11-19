package office;

public class QA extends ScrumTeamMember {

	protected int capacity = 10;
	String tickets = "Log out story";
	
	@Override
	public void work() {
		System.out.println("QA " + teamName + "  capacity "+
	capacity + " working on " + tickets);
		joinStanUpMeeting();
	}
	

	public static void joinStanUpMeeting() {
		System.out.println("Qa team member is attending daily stand up meeting");
	}
}
