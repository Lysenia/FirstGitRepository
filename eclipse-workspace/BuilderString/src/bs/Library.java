package bs;

public class Library {
	
	public static void main (String args[]) {
		
		Book book1 = new Book();
		book1.setTitle("Java for Babies");
		
System.out.println(book1.getTitle());
		
		Book book2 = new Book("I love Java");
		String titleOfBook2 = book2.getTitle();
		System.out.println(titleOfBook2);
//		book2.setTitle("I love Java");
		
Book book3 = new Book();
//		book3.setTitle("Java is fun");
	}

}
