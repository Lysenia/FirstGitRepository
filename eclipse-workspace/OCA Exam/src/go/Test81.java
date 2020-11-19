package go;

public class Test81 {

	public static void main(String[] args) {
		double discount =0;
		int qty = Integer.parseInt(args[0]);
		
		
		
	if (qty >= 90) {
		discount = 0.5;
		}
	if (qty > 80 && qty < 90) { 
		discount = 0.2;
		}
	
//	discount = (qty > 80) ? 0.2 : 0;

		//C: True
		//discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;

		/*D: False
		if (qty > 80 && qty = 90) {discount = 0.5;}
		else {discount = 0;} */

		/*E: False
		discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;*/

		//Output
		System.out.println(discount);
		}
		}