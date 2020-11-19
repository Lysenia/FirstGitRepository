package bs;

public class Book {
	
	private String title;
	private double price;
	private String author;
	
	public Book() {
		this("unknown");
		System.out.println("Printing a book");
	}
	
	public Book(String title) {

		this.title = title;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}

	public String getTitle () {
		return title;
	}
}
