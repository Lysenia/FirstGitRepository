package comparableDemo;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class Utility {
	
	public static void printStuff(List<Employee> employees) {
	    for (Employee e : employees) {
	      System.out.println(e.getId() + "\t" + e.getLastname() 
	      + ", " + e.getFirstname() + "\t(" + e.getAge() + ")");
	    }    
	  }
	  
	  public static List<Employee> getEmployeeList(int numberOfEmployees) {
	    List<Employee> employees = new ArrayList<>();
	    Faker myFaker = new Faker();
	    
	    for (int i = 0; i < numberOfEmployees; i++) {
	      employees.add(new Employee(myFaker.name().firstName(), 
	                       myFaker.name().lastName(),
	                       myFaker.number().numberBetween(20, 90),
	                       myFaker.number().numberBetween(1000, 1100)));
	    }  
	    
	    return employees;
	  }
	}
