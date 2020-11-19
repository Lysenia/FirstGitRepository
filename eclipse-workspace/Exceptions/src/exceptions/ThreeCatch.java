package exceptions;

public class ThreeCatch {
	public static void main(String args[]) {

		System.out.println("beginning of the program");
		
	int j = 2;
	int i = 0;
	double division = 0;
	
	Object o = new String();
	
		
		try {
			String v = (String)o;
			o = null;
			o.toString();
			division = 2/0;
		}
		catch(ArithmeticException e){
			System.out.println("arithmetic exception");	
		}
        catch(ClassCastException c){
        	System.out.println("class cast exception");	
		}
		
catch(NullPointerException n){
 	System.out.println("null pointer exception");
 	System.out.println(6/0);
		}
		
		catch(Exception e){
		 	System.out.println("exception");
		 	
				}
	System.out.println("ending the program");
	}
	}


