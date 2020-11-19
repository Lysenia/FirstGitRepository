package bs;

import java.util.Arrays;

public class SmallTask {

	public static void main (String args[]) {
		
		int fourD [][][][];
		long [][][] threeD = new long [4][3][2];
		
	
		double [][] priceTag = new double [3][];
		priceTag [0] = new double[] {2.5, 2.9, 3.1, 4.1};
		priceTag [1] = new double[] {3.5, 2.9, 3.4, 4.8};
		priceTag [2] = new double[] {99.99};
		
	 
		
		System.out.println(Arrays.toString(priceTag[0]));
		System.out.println(Arrays.deepToString(priceTag));
		
//double[][] priceTag= { { 2.5, 2.9, 3.1, 4.1 }, { 2.8, 5.1, 7.4, 3.99 }, { 3.1 } };
//
//for(int i=0;i<priceTag.length;i++) {
//System.out.println(" level "+(i+1) + " has " + priceTag[i].length + " items" + " they are : ");
//for(int j=0;j<priceTag[i].length;j++) {
//System.out.print(priceTag[i][j]);
//			

int[][]nums = new int [2][3];


//System.out.println(Arrays.deepToString(nums));

int[][]nums1 = new int [2][];
System.out.println(Arrays.deepToString(nums));
		
		}
}

