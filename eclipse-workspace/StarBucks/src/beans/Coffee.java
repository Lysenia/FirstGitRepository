package beans;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Drinks{

	
	public Coffee(String name, String size, int calories, double price) {
		super(name, size, calories, price);
		
	}


	private static List<String>options;
	
	static {
		options = new ArrayList<>();
		options.add("FRESHLY BREWED COFFEE");
		options.add("ICED COFEE");
		options.add("CAFFEE AMERICANO");
		options.add("FLAT WHITE");
		options.add("CAFEE LATTE");
		options.add("CARAMEL MACCHIATO");
		options.add("WHITE CHOCLATE MOCHA");
		options.add("CAFFE MOCHA");
	
	}
	
	
	public void setName(String name) {
		  //make sure coffee name is present as one of options
		  if(options.contains(name.toUpperCase())) {
		    super.setName(name);
		  }else {
		    System.out.println("CoffeeNameNotFoundException :" + name);
		  }
	}
		  

		  public String toString() {
				return "\nCoffee [name=" + getName() + ", size=" + getSize() + ", calories=" + 
			             getCalories() + ", price=" + getPrice() + "]\n";
			}
			
		
}

