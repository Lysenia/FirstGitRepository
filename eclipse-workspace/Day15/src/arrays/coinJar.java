package arrays;

public class coinJar {
	public static void main(String[] args) {
		int cointJar[] = {10, 10, 25, 25, 5, 5, 25, 10};
		int quaters, dimes, nickels ;
		quaters = dimes =nickels =0;
		
		for(int coin: cointJar) {
			switch(coin) {
			case 25:
				quaters ++;
				break;
			case 10:
				dimes ++;
				break;
			case 5:
				nickels++;
				break;
				
				default:
			System.out.println("No coins");
			break;
				
				
				
			}
				
		}
		System.out.println("You have" + quaters + "quaters" + (quaters*25) + "cents" );
		System.out.println("You have" + dimes + "dimes" + (dimes*10) + "cents" );
		System.out.println("You have" + nickels + "nickels" + (nickels*100) + "cents" );
	}

}
