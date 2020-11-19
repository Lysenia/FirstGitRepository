package books;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	
	

	public class BooksController implements BooksManager {
		
		List<Book> booksCatalog = new ArrayList<>();
		List<Reader> readerList = new ArrayList<>();
		
		{
		loadBooks("BooksData.csv", booksCatalog);
		}

		@Override
		public void addReader(String name, String plan) {
			readerList.add(new Reader(name,plan));
			
		}
		
		public StringBuilder getBooksInformation() {
			StringBuilder st = new StringBuilder();
			Collections.sort(booksCatalog);
			for(Book book: booksCatalog) {
				st.append(book.toString() + "\n");
			}
			return st;
		}
		
		@Override
		public void addBook(String... details) {
		Book thisBook = null;
			switch (details[0]) {
	        case "PaperbackBook":
	          thisBook = new PaperbackBook(details[1], details[2], new Author(details[3]), 
	              Double.parseDouble(details[4]), Integer.parseInt(details[7]), Integer.parseInt(details[8]));
	          break;
	        case "AudioBook":
	          thisBook = new AudioBook(details[1], details[2], new Author(details[3]), 
	              Double.parseDouble(details[4]), Integer.parseInt(details[5]), Integer.parseInt(details[6]));
	          break;
	        }
			booksCatalog.add(thisBook);
		}
		
		@Override
		public Book getRandomBook() {
			// TODO Auto-generated method stub
			return null;
		}
	
	  public static void loadBooks(String fileName, List<Book> storageList) {
	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	      String line = "";
	      line = br.readLine();
	      
	      while ((line = br.readLine()) != null) {
	        // type  title  genre  author  price  rating  length  copiesAvailible  pages
	        // 0  1    2    3    4    5    6    7        8
	        String cell[] = line.split(",");
	        Book thisBook = null;
	        switch (cell[0]) {
	        case "PaperbackBook":
	          thisBook = new PaperbackBook(cell[1], cell[2], new Author(cell[3]), 
	              Double.parseDouble(cell[4]), Integer.parseInt(cell[7]), Integer.parseInt(cell[8]));
	          break;
	        case "AudioBook":
	          thisBook = new AudioBook(cell[1], cell[2], new Author(cell[3]), 
	              Double.parseDouble(cell[4]), Integer.parseInt(cell[5]), Integer.parseInt(cell[6]));
	          break;
	        }
	        storageList.add(thisBook);
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }

	@Override
	public List<Book> getPaperbackBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAudioBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	}




