package arrays;

public class PizzaTopping {
	
	public static void main (String args[]) {
		
		String[][] pizza= {{"Mushroom","Black Olive","Green Pepper"},
				{"Spinach","Green Pepper","Mushroom"},
				{"black olive","black olive","spinach"},
				{"mushroom","mushroom","red pepper"},
				{"banana pepper","spinach","red pepper"},
				{"mushroom","green pepper","green pepper"},
				{"spinach","green pepper","mushroom"}};
		
	ATTENTION:
		for(int i=0; i<pizza.length; i++) {
			System.out.println("slice  " + (i+1) + "   topping are: ");
			for(int j=0; j<pizza[i].length; j++) {
				if(pizza[i][j].equalsIgnoreCase("spinach")) { 
					continue ATTENTION;
				}
				if(pizza[i][j].equalsIgnoreCase("black olive")) {
					break;
				}
				if(pizza[i][j].equalsIgnoreCase("red pepper")) 
					break ATTENTION;
				
				System.out.print(pizza[i][j] + ",");
			}
			System.out.println();
		}
		}
	
	}


