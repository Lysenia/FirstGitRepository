package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class HR_ArrayList {
	
	public static void main(String args[]) {
		
		System.out.println("--------------ArrayList------------");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(100, "Steven","King", 4500.0));
		employees.add(new Employee(101, "Sarah","Sanders", 5500.0));
		employees.add(new Employee(102, "Bob","Marshal", 5500.0));
		
		double newSalary = employees.get(0).getSalary() + 1000;
		
		employees.get(0).setSalary(newSalary);
		
		System.out.println(employees.get(0).getSalary());
		
		for(Employee employee:employees) {
			if(employee.getSalary()>5000) {
				System.out.println(employee.getFirstName() + " " + employee.getLastName() +
						employee.getSalary());
			}
		}
	}

}
