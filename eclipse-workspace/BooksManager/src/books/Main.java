package books;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
		  
	public static void main(String[] args) {
		    //Polymorhism. Reference type is parent, Object is child type
//		    Book audibleBook = new AudioBook("Twisted Prey", "Thriller", new Author("John Sandford"), 28.0, 4, 689);
//		    
//		    System.out.println(audibleBook.toString());
//		    
//		    System.out.println(((AudioBook) audibleBook).getLength());
//		    
//		    List<Book> booksList = new ArrayList<>();
//		    
//		    booksList.add(new PaperbackBook("Adult Camp","Comedy",
//		    		new Author("Persis Orts"),54,8,39));
//		    booksList.add(new AudioBook("Mr.Turner","Drama",
//		    		new Author("GarField"),45,1,112));
//		    
//		 
//		    
//		    for(Book book: booksList) {
//		    	
//		    	if( book instanceof PaperbackBook) {
//		    		System.out.println("Paperback Book");
//		    	}
//		    	else if( book instanceof AudioBook) {
//		    		System.out.println("Audio Book");	
//		    		
//		    	}
//		   
//		    	System.out.println(book.getClass().getSimpleName());
//		    	System.out.println(book.getClass().getName());
//		    	System.out.println(book.toString());
//		    }
//		    
//		    List<Book> booksFromFile = new ArrayList<>();
//		    BooksController.loadBooks("BooksData.csv", booksFromFile);
//		    System.out.println("number of books "  + booksFromFile.size());
//		    
//		    for(Book book: booksFromFile) {
//		    	System.out.println(book.toString());
//		    }
//		    
// Collections.sort(booksFromFile);
// 
// for(Book book: booksFromFile) {
//	 System.out.println(book.toString());
// }
// 
// Book book1 = new PaperbackBook("Adult Camp","Comedy",new Author("Persis Orts"),54,8,39);
// Book book2 = new AudioBook("Mr.Turner","Drama",new Author("GarField"),45,1,112);
// 
// System.out.println(book1.compareTo(book2));
// System.out.println(book2.compareTo(book1));
// book1.setTitle(book2.getTitle());
// System.out.println(book1.compareTo(book2));
		
		BooksController controller = new BooksController();
		
		controller.addReader("Lesia", "LIMITED");
		controller.addReader("Ketie", "UNLIMITED");
		controller.addReader("Romeo", "UNLIMITED");
		controller.addReader("Julliet", "LIMITED");
		
		System.out.println(controller.readerList);
		
		controller.addBook("AudioBook", "Adult Camp","Comedy","Persis Orts","54","39", "34");
		controller.addBook("AudioBook", "Firsr Cammend","Drama","Persis Orts","44","9","11");
		
		System.out.println(controller.getBooksInformation());
}
	
	
}

//		    Book [] books = new Book[10];//Book is abstract, so we are creating array of books,
//		    we are not creating book object
		  


