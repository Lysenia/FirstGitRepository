package oca;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class Clock {
	
			   public static void main(String args[]){
				   
				   LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
				   dt.plusDays(30);
				   dt.plusMonths(1);
				   
				   System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
			      
//				   for(int i = 0; i< args.length; i++){
//			         System.out.print("  "+args[2]);
			      }
			   
			
//		
//		int ia[][] = { {1, 2}, null };
//		for (int i = 0; i < 2; i++)
//	         for (int j = 0; j < 2; j++)
//	            System.out.println(ia[i][j]);
//	   }
//	
//		List <String>names = new ArrayList<>();
//		names.add("Rob");
//		names.add("Bran");
//		names.add("Rick");
//		names.add("Bran");
//		
//		if (names.remove("Bran")) {
//		names.remove("John");
//		}
//		System.out.println(names);
//		String chs [][] = new String[2][];
//		chs[0] = new String[2];
//		chs[1] = new String[5];
//		
//		int i = 97;
//		
//		System.out.println(chs.length);
//		
//		for(int a =0; a<chs.length; a++) {
//			for(int b = 0; b<chs.length; b++) {
//				chs[a][b] = " " + i;
//				i++;
//			}
//		}
//		
//		for(String[]ca: chs) {
//			for(String c: ca) {
//				System.out.println(c + " ");
//			}
//		}
//		System.out.println();
//		int num = 5;
//		
//		do {
//			System.out.println(num-- + ",");
//		}
//		while(num==0);
//		int x = 100;
//		int a = x++;
//		System.out.println(a);
//		int b=++x;
//		System.out.println(b);
//		int c = x++;
//		System.out.println(c);
//		
//		int d = (a<b)?(a<c)?a:(b<c)?b:c:c;
//		LocalDate date = LocalDate.of(2014, 6, 21);
//		LocalDate date1 = LocalDate.of(2014, Month.JUNE, 21);
		
//		LocalDate date = LocalDate.parse("2018-4-30", DateTimeFormatter.ISO_LOCAL_DATE);
//		date.plusDays(2);
//		date.pl
		
		
		
		
}
	
