package ready;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReadyForExam {
	
public static void main(String args[]) {
	
	int x = 5;
	while(isAvailable(x)) {
		System.out.println(x);
	x--;
	}
	
	
}
	
public static boolean isAvailable(int x) {
	return x-->0?true:false;
}
//		int aVar = 9;
//		
//		if(aVar++<10) {
//			System.out.println(aVar + "Hellow World");
//		}
//		else {
//			System.out.println(aVar + "Hellow Universe");
//		}
//	}
	
//	
//	String date = LocalDateTime.parse("2014-05-4").format(DateTimeFormatter.ISO_DATE_TIME);
//	System.out.println(date);
	
//
//	short s1 =200;
//	Integer s2 = 400;
//	Long s3 = (long) s1+s2;
////	String s4 = (String)(s3*s4);
//	
//	StringBuilder sb = new StringBuilder(5);
//	String s  = "";
//	
//	if(sb.equals(s)) {
//		System.out.println("Match 1");
//	}else if(sb.toString().equals(s.toString())) {
//		System.out.println("Match 2");
//	}
//	else {
//		System.out.println("No Match");
//	}
//}
//		
//int a [] = {1,2,3,4,5};
//for(int e=0; e<=4;e+=2) {
//	System.out.print(a[e]);
//}
		
//		String shirts[][] = new String [2][2];
//		shirts[0][0] = "red";
//		shirts[0][1] = "blue";
//		shirts[1][0] = "small";
//		shirts[1][1] = "medium";
//		
//		for(int index =0; index<2; ++index) {
//			for(int idx =0; idx<index; ++idx) {
//				System.out.println(shirts[index][idx] + ":");
//			}
//		}
//	}
//	
//	void readCard(int cardNo) throws Exception{
//		System.out.println("reading card");
//	}
//	
//	void checkCard(int cardNo) throws RuntimeException{
//		System.out.println("checking card");
//	}
//	
//	public static void main(String args[]) {
//		ReadyForExam ex = new ReadyForExam();
//		int cardNo = 123;
////		ex.readCard(cardNo);
//		ex.checkCard(cardNo);
//	}
	
}
//}
