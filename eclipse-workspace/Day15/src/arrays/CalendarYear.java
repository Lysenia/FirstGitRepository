package arrays;



public class CalendarYear {
public static void main (String args[]) {
	String MonthName [] = {"December", "January", "February", "March", "April",
			"May", "June", "July", "August", "September", "October", "November"};
	int days = 31;
	int firstDay = 0;
	
	for (String months: MonthName) {
		System.out.print(months + "\t");
	}
	for (int i =0; i<firstDay; i++) {
		System.out.print("\t");
	}
	for(int i =1 ; i<= days; i ++) {
		System.out.print(i + "\t");
		if((i+firstDay) % 7 ==0) System.out.println();
}
	}
}


