package sunday_Murodil;

public class Message {
	
	 private String title;
	    public static int count;
	    
	    static{
	      count = 0;
	    }

	    {
	      count++;
	    }
	    
	    public Message(String title) {
	        setTitle(title);
	    }
	    
	    public void setTitle(String title) {
	       this.title = title;
	    }

	    public static int getCount(){
	       return count;
	    }
	

}
