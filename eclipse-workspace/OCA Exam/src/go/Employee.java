package go;
// Test25

public class Employee {
	
	String name;
	boolean contract;
	double salary;
	
	Employee(){
		
//		this.name = new String("Joye");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
		
	}
	
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}
public static void main(String aegs[]) {
	Employee e = new Employee();
//	e.name = "Joye";
//	e.contract = true;
//	e.salary = 100;
	
	System.out.print(e);
}
}
