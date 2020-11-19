package arrays;

public class ReversingArray {
	public static void main(String[] args) {

		int [] nums = {12,32,54,74};
		for (int i = 0; i<nums.length; i++) {
		System.out.print(nums[i] + " ");
		
}
		System.out.println("reversed");
		for (int j= nums.length-1; j>=0; j--) {
		System.out.print(nums[j] + " ");
}
}
}