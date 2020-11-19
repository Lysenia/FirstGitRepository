package oca;

public class chapter2 {
public static void main(String args[]) {
	
	
//	int x=5;
//	 System.out.print(x>2?x<4?10:8:7);
//}
//}
	
	
	
//	int x = 5*4%3;
//	System.out.println(x);
	
//	
//boolean keepGoing = true;
//int result =15, i=10;
//
//do {
//	i--;
//	if(i==8) keepGoing =false;
//	
//	result-=2;
//}
//while(keepGoing);
//}


Integer i = new Integer(1) ;
Long m = new Long(1);
if( i.equals(m)) System.out.println("equal");   // 1
else System.out.println("not equal");
	
	
//	int c=7;
//	int result = 4;
//	
//	result+=++c;
//	
//	System.out.println(result);
//	
	
//	for(int i=0; i<10;) {
//		i=i++;
//		System.out.println("Hello world");
//	}
//	boolean x=true, z=true;
//	
//	int y =20;
//	
//	x=(y!=10)^(z=false);
//	
//	 System.out.print(x + ",  " + y +", " + z);
	
	
	
	 
//	 
//	 java.util.List<Integer> list = new java.util.ArrayList<Integer>();
//	 list.add(10);
//	 list.add(14);
//	 
//	 for(int x: list) {
//		 System.out.print(x + ", ");
//	 }
//	 
	 
	 double d = 6.0%5;
	 System.out.println(d);
	 
	 
	

	
//	
//String cat = "animals", dogs = "animals";
//
//double D = new Double (100_00_00.00);
//
//int num = _9_99;
//
//int num1=0,num2 =0;
//
//
//String i = null;
//double num = 2.718;

int x = 10%2;
int y = 3/5 + ++x;
int z = 4*x;

System.out.println(x + "" +y+ "" +z);


String hello = "Hello", lo = "lo";

System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
System.out.println(hello == ("Hel"+lo).intern());          //line 5


}
}

