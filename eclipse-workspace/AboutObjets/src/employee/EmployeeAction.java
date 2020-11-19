package employee;

public class EmployeeAction {
	public static void main (String args[]) {
		
		Employee e1 = new Employee();
		e1.setName("Timothi");
		e1.setEmployeeId(1225l);
		e1.setSalary(11000);
		
		Employee e2 = new Employee();
		e2.setName("Bob");
		e2.setEmployeeId(2345l);
		e2.setSalary(22000);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
	
}
}