package abs;

public abstract class ProgrammingLanguage {
	
	public abstract void buildApplication();
	
	public void deploy() {
		System.out.println("Deploying program to a server");
	}

}
