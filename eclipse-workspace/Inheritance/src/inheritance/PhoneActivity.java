package inheritance;

import phone.CellPhone;
import phone.LandLine;

public class PhoneActivity {

	public static void main(String args[]) {
		
		CellPhone iphone = new CellPhone("iphone", 12.0);
		LandLine phone = new LandLine("old", 2.0);
		
		System.out.println(iphone.getBrand());
		System.out.println(iphone.getSize());
		System.out.println(phone.getBrand());
		System.out.println(phone.getSize());
		iphone.makeCallFromCellPhone();
		phone.makeCallFromLandLinePhone();
		
	}
}
