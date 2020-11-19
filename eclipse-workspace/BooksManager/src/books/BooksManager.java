package books;

import java.util.List;

public interface BooksManager {

	public static final String LIMITED = "LIMITED";
	public static final String UNLIMITED = "UNLIMITED";
	public static final int LIMITED_PLAn_LIMIT = 2;
	
	public abstract void addReader(String name, String plan);
	
	void addBook(String...details);
	Book getRandomBook();
	List<Book> getPaperbackBooks();
	List<Book> getAudioBooks();
	
	
}
