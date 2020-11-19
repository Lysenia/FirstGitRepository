package abs;

public class Engineer extends Person implements Smarty{
	
	int trainingId;

	public Engineer(String name, int age, int trainingId) {
		super(name, age);
		this.trainingId= trainingId;
		// TODO Auto-generated constructor stub
	}
	
	public int trainingId() {
		return trainingId;
	}
	
public void design(String args) {
	System.out.println("Engeneer is designing" + args);
}


public String toString() {
	return "Engeneer [name=" + name + ", age=" + age + " training Id" + trainingId +  "]";
}
	
}

