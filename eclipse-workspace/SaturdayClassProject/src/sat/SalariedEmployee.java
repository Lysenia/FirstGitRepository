package sat;

public class SalariedEmployee extends Employee {
	
	int salary;
	
	public SalariedEmployee(String name, int id, int salary) {
		super(name, id);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}


	public int getSalary() {
		return salary;
	}
	
	 @Override
	  public String toString() {
	    return "SalariedEmployee [salary=" + salary + ", name=" + name + ", ID=" + Id + "]";
	  }

	  int calculateYearlySalary() {
	    return salary * 12;
	  }


	@Override
	public void getPaid() {
		System.out.println(this.calculateYearlySalary());
		
	}

	

}
