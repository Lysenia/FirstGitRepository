package loops;

public class Loop1 {

	public static void main(String[] args) {
		
		int k = 0;
	      int m = 0;
	      for ( int i = 0; i <= 3; i++){
	         k++;
	         if ( i == 2){
	            continue;
	         }
	         m++;
	      }
	      System.out.println( k + ", " + m );
	   }
	
		
	}
	

