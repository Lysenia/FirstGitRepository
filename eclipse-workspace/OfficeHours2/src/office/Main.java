package office;

public class Main {
	
	public static void main(String args[]) {
		
	
	QA qaEngeneer = new QA();
	
//	System.out.println(qaEngeneer.teamName);
//	System.out.println(qaEngeneer.capacity);
//	System.out.println(qaEngeneer.tickets);
	
	ScrumTeamMember qaEngeneer2 = new QA();
//	System.out.println(qaEngeneer2.teamName);
//	System.out.println(qaEngeneer2.capacity);
//	System.out.println(qaEngeneer2.tickets);
	
	ScrumTeamMember qaEngeneer3 = new ScrumTeamMember();
	
	qaEngeneer.work();
	qaEngeneer2.work();
	qaEngeneer3 .work();
}
}