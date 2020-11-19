package bs;

public class ArmstrongNumber {

	public static void main (String args[]) {
		
		ArmstrongNumber.isArmstrongNumber(153);
		ArmstrongNumber.isArmstrongNumber(44);
		
	}
	
	public static void isArmstrongNumber(int number) {
		int copyNumber = number;
		int noOfDigit = String.valueOf(copyNumber).length();
		int sum =0;
		
		while(copyNumber!=0) {
			int lastDigit = copyNumber%10;
			int sumOfAll = 1;
			
			for(int i=0; i<noOfDigit;i++ ) {
				
				sumOfAll=sumOfAll*lastDigit;
			}
			sum = sum + sumOfAll;
			copyNumber = copyNumber/10;
		}
		
		if(sum==number) {
			System.out.println("it's an armstrong number  " + number);
		}
		else {
			System.out.println("it's not an armstrong number, because " + sum + "  is");
			
		}
			
		
	}
}
