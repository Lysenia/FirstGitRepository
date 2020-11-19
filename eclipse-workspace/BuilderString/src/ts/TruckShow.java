package ts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckShow {

	public static void main (String args[]) {
		
		Truck t1 = new Truck("MonsterTruck1", 2020, 1000.00);
		Truck t2 = new Truck("MonsterTruck2", 2028, 2000.00);
		Truck t3 = new Truck("MonsterTruck1", 2018, 3000.00);
		Truck t4 = new Truck("MonsterTruck1", 1800, 4000.00);
		Truck t5 = new Truck("MonsterTruck1", 2056, 5000.00);
		
//		List<Truck> lst = Arrays.asList(t1,t2,t3,t4,t5);
		
		ArrayList<Truck> lst = new ArrayList<>();
		lst.add(t1);
		lst.add(t2);
		lst.add(t3);
		lst.add(t4);
		lst.add(t5);
		
		for(int i=0; i<lst.size() ; i++) {
			Truck each = lst.get(i);
			
			System.out.println(each.toString());
			double originalPrice = lst.get(i).getPrice();
			lst.get(i).setPrice(originalPrice + originalPrice*0.1);
			System.out.println("----------------------");
			for(Truck eachTruck: lst) {
				System.out.println(each.toString());
			}
		}
	}
}
