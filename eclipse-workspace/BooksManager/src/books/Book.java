package books;

public abstract class Book implements Comparable<Book> {
	
	//Encapsulation
	  private String title;
	  private String genre;
	  //HAS-A relation. Book HAS-A Author. Composition
	  private Author author;
	  private double price;
	  
	  public Book(String title, String genre, Author author, double price) {
	    super();
	    this.title = title;
	    this.genre = genre;
	    this.author = author;
	    this.price = price;
	  }
	  public String getTitle() {
	    return title;
	  }
	  public void setTitle(String title) {
	    this.title = title;
	  }
	  public String getGenre() {
	    return genre;
	  }
	  public void setGenre(String genre) {
	    this.genre = genre;
	  }
	  public Author getAuthor() {
	    return author;
	  }
	  public void setAuthor(Author author) {
	    this.author = author;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  
	  @Override //OVerriding from Object class
	  public String toString() {
	    return "title=" + title + ", genre=" + genre + ", author=" + author + ", price=" + price ;
	  }
	  
	  @Override
	 
	  public int compareTo(Book another) {
		  return this.title.toUpperCase().compareTo(another.title.toUpperCase());
	  }
//		  if(this.price > another.price) {
//		    return 1;
//		  }else if(this.price < another.price) {
//		    return -1;
//		  }
//		  
//		  return 0;  
//		}
	}


