package exceptions;

public class InClass {
	public static void main(String args[]) {
		
	
	String s = null;
    try {

      // s.concat("12321");
      int[] arr = new int[4];
      System.out.println(arr[4]);

    } catch (NullPointerException e) {

      System.out.println("null pointer exception");

    } catch (ArithmeticException e) {

      System.out.println("  ArithmeticException ");

    } catch (RuntimeException e) {
      System.out.println(" any other RuntimeExceptions ");

    } catch (Exception e) {
      System.out.println(" any other Exception ");

    } catch (Throwable e) {
      System.out.println(" any other Throwable ");

    }
/// ALWAYSE CATCH SUB CLASS EXCEPTION TYPE FIRST THEN SUPER CLASS EXCEPTION TYPE LATER
    
    System.out.println("abc");

  }

}


