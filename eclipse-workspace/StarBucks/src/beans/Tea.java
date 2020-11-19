package beans;

import java.util.ArrayList;
import java.util.List;

public class Tea extends Drinks {
	
	public Tea(String name, String size, int calories, double price) {
		super(name, size, calories, price);
		
	}


	private static List<String>options;
	
	static {
		options = new ArrayList<>();
		options.add("CINNAMON CHAI LATTE");
		options.add("CLASSIC CHAI TEA LATTE");
		options.add("PEACH GREEN TEA LEMONADE");
		options.add("SHAKEN ICED TEA");
		options.add("VERY BERRY HIBISKUS");
	
	
	}
	
	
	public void setName(String name) {
		  //make sure coffee name is present as one of options
		  if(options.contains(name.toUpperCase())) {
		    super.setName(name);
		  }else {
		    System.out.println("TeaNameNotFoundException :" + name);
		  }
		
}


	@Override
	public String toString() {
		return "Tea [name=" + getName() + ", size=" + getSize() + ", calories=" + 
	             getCalories() + ", price=" + getPrice() + "]";
	}
	}




