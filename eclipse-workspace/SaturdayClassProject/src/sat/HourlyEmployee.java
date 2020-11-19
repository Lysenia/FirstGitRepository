package sat;

public class HourlyEmployee extends Employee{
	
	int wage;
	int hours;
	
	public HourlyEmployee(String name, int id, int wage, int hours) {
		super(name, id);
		this.wage=wage;
		this.hours=hours;
		// TODO Auto-generated constructor stub
	}
	
	int calculateYearlyWage() {
	    return wage * hours * 52;
	  }
	
	@Override
	public void getPaid() {
		System.out.println(this.calculateYearlyWage());
	  }
	
		
	}
	


