package men;

public class Mentorship {

	public static String school;
	private String name;
	private int iD;
	
	
	public String getName() {
		return name;
	}

	public int getiD() {
		return iD;
	}

	
	public Mentorship(String name, int iD) {
		this.name=name;
		this.iD=iD;
	}
	
	public Mentorship(int iD) {
	this.iD=iD;
	}
	
	public void setId(int iD) {
		this.iD = iD;
	}
	


}
