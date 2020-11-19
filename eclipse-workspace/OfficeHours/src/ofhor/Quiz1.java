package ofhor;

public class Quiz1 {
	
	    static int x;
	    StringBuilder sb = new StringBuilder();
	    static StringBuilder sb2 = new StringBuilder();
	    public Quiz1() {
	      m1();
	      m2();
	    }
	    public void m1(){
	        x += 5;
	        sb.append(x);
	    }
	    public void m2(){
	        x += 10;
	        sb2.append(x);
	    }
	    public static void main(String[] args){
	    	Quiz1 t1 = new Quiz1();
	    	Quiz1 t2 = new Quiz1();
	    Quiz1 t3 = new Quiz1 ();
	    String s = t2.sb + "-" + t2.sb2;
	    System.out.println(s);
	      }
	  }


