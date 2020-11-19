package arrays;

public class Labels {

	public static void main(String args[]) {
		
		CONSTRUCTION:
			for(int i=1; i<=2; i++) {
				for(int j =1; j<=7; j++)
					if (j>3) {
						continue CONSTRUCTION;
					}
				System.out.print(i);
			}
	}
}
