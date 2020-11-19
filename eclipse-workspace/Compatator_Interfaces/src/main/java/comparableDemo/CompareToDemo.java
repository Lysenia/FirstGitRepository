package comparableDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareToDemo {
	
	public static void main(String[] args) {
	    List<Employee> employees = Utility.getEmployeeList(5);
	    
	    System.out.println("-- Unsorted List of Employees --");
	    Utility.printStuff(employees);
	    
	    EmployeeComparator ecById = new EmployeeComparator();
	    System.out.println("-- Sorted Using Comparator Class by Id --");
	    Collections.sort(employees, ecById);
	    Utility.printStuff(employees);
	  
	
	
    System.out.println("-- Sorted Using Lambda by Age --");
    Comparator<Employee> loByAge = (e1,e2)-> e1.getAge()-e2.getAge();
    //Collections.sort(employees, (e1,e2)-> e1.getAge()-e2.getAge());
    Collections.sort(employees, loByAge.reversed());
    
    Utility.printStuff(employees);
  }
	}

