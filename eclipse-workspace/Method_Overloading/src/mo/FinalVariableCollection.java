package mo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalVariableCollection {
	public static void main(String args[]) {
		
		final int[] nums = new int[] {1,2,3,4,5};
		nums[0] = 12;
		
		System.out.println(Arrays.toString(nums));
		
		final List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(2, 1);
		
		System.out.println(list);
		

}
}