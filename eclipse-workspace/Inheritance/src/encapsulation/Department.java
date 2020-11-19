package encapsulation;

public class Department {

	private int departmentID;
	private String departmentName;
	private Department department;
	
	public Department() {
		
	}
	
	public Department(int departmentID, String departmentName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		
	}
	
	public int getDepartmentID() {
		return departmentID;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}