package exception;

public class MoreExc {
	
	static int[] x = new int[0];
	static{
		x[0] = 10;
	}
		   public static void main(String[] args){
			   
			   
			   

			   int var=20, i=0;
			   
			   do 
				   while(true) {
					   if(i++>var)break;
				   }
			   while (i<var--);
				System.out.println(var);	   
		   }

		   public static int doIt() throws Exception{
		      throw new Exception();
		   }
		}


