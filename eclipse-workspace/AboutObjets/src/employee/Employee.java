package employee;

public class Employee {

	private String name;
	private long employeeId;
	private double salary;
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getEmployeeId() {
		return employeeId;
		}
	
	public void setEmployeeId( Long employeeId) {
		this.employeeId = employeeId;
	}
		
	public double getSalary() {
		return salary;
		}
	
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	
	public String toString () {
		String output = "Employee[name =  " + name + " " +
				"EmployeeId: " + employeeId + " " + "Salary:" + salary;
		return output;
	}
		
	}

