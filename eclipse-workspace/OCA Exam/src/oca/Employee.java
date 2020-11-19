package oca;

public class Employee {
	
	String name;
	boolean contract;
	double salary;
	
	Employee(){
//		this.name = new String("Joyee");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
	}
	
	public static void main(String args[]) {
		Employee e = new Employee();
		e.name = "Joye";
		e.contract = true;
		e.salary = 200;
	}

}
