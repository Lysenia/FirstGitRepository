package books;

import java.util.ArrayList;
import java.util.List;

public class Reader {
	
	private String name;
	private String plan;
	List<Book> reading = new ArrayList<>();
	List<Book> listening = new ArrayList<>();
	
	public Reader(String name, String plan) {
		super();
		this.name = name;
		this.plan = plan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlan() {
		return plan;
	}
	
	
	public void setPlan(String plan) {
		this.plan = plan;
	}

	

	public List<Book> getReading() {
		return reading;
	}
	
	public boolean addReading(Book book) {
		if(plan.equalsIgnoreCase(BooksManager.LIMITED)) {
		if(reading.size()<BooksManager.LIMITED_PLAn_LIMIT)	{
			reading.add(book);
			return true;
		}else {
			System.out.println( name + " Reached account limit." + book.getTitle());
			return false;
		}
		}
		reading.add(book);
		return true;
	}
	
	public void setReading(List<Book> reading) {
		this.reading = reading;
	}
	public List<Book> getListening() {
		return listening;
	}
	
	public boolean addListening(Book book) {
		if(plan.equalsIgnoreCase(BooksManager.LIMITED)) {
		if(listening.size()<BooksManager.LIMITED_PLAn_LIMIT)	{
			listening.add(book);
			return true;
		}else {
			System.out.println( name + " Reached account limit." + book.getTitle());
			return false;
		}
		}
		listening.add(book);
		return true;
	}
	
	public String toString() {
	    return name + " - " + plan ;
	  }
	  

	}

