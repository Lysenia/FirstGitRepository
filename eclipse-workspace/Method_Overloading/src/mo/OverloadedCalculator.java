package mo;

public class OverloadedCalculator {
	
	

	public int add(int a) {
		int sum = a+a;
		return sum;
	}
	
	public void add(double d, float f) {
		double result = d+f;
		System.out.println("result is " + result);
	}
	
	public int add(int [] array) {
		int sum =0;
		
//		for(int eachNumber:array) {
//			sum = sum + eachNumber;
//		}
		for(int i=0; i<array.length; i++)
		sum = sum+ array[i];
		return sum;
	}
	
	public long add(long [] longs) {
		long sum =0;
		for(int i=0; i<longs.length; i++) {
			if(longs[i]<20)  return sum;
		sum = sum+ longs[i];
	}
			return sum;
	}
}
	
