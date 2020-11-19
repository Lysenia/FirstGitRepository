package begginer;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		
//		String str = "abc";
//		str = str +"efg";
//		str = "abc" + "efg";
//		
//		int [] ints = new int[7];
//		double [] ds = new double[2];
//		
//		ds[0] = 12.2;
//		ds[0] = 1.56;
//		
//		ds[1] = ds[1]+3;
//		
//		
//		System.out.println(ds[0]);
//		System.out.println(ds[1]);
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5;i++)	{
			double ds = sc.nextDouble(); 
			System.out.println(i);
			
		for (int j = 0;j<5; j++ ) {
			ds = ds *2;
	
			System.out.println(ds);
		}
	}

}
}
