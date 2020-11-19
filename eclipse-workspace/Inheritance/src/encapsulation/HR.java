package encapsulation;

public class HR {

	public static void main(String args[]) {
		
		Employee [] employees = new Employee[3];
		employees[0] =  new Employee(100, "Steven", "King",6000.0);
		employees[1] =  new Employee(101, "Bob", "Smith",5000.0);
		employees[2] =  new Employee(102, "Sarah", "Pocker",8000);
		
//		System.out.println( employees[0].getFirstName() + ":" + employees[0].getSalary());
		
//		for(int i=0; i<employees.length; i++) {
//			System.out.println( employees[i].getFirstName() + ":" + employees[i].getSalary());
//		}
//		

		for(Employee emp: employees ) {
			System.out.println( emp.getFirstName() + ":" + emp.getSalary());
		}
}
}
