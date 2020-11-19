package bs;

import static bs.MyUtility.*;
import static bs.MyUtility.doSomethingelse;
import static bs.MyUtility.doSomething;

public class StaticImportExamples {
	
	static String myAction;
	int myNumber;
	
	
	public static void main(String args[]) {
		doSomething();
		
		doSomethingelse(myAction);
		
		System.out.println(action1);
		
		StaticImportExamples s1 = new StaticImportExamples();
		System.out.println(s1.myNumber);
		

}
}
