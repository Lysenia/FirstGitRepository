package encapsulation;

public class Employee {

	private int employeeID;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	private Department Department;
	
	public Employee() {
		
	}
	
	public Employee(int employeeID, String firstName,String lastName,double salary ) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
//	public String getEmail() {
//		return email;
//	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
