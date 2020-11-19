package go;

public class Test37 {

	static int count =0;
	int i=0;
	
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
		}
	}
	public static void main(String args[]) {
		Test37 check = new Test37();
		Test37 check2 = new Test37();
		check.changeCount();
		check2.changeCount();
		System.out.print(check.count + ":"+ check2.count);
}
}
