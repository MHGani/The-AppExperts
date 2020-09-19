package apollo.exercises.ch06_classes;

public class Book {

	String Title;
	String Author;
	String NumPages;
	String Isbn;
	
public Book (String title, String author, String numPages, String isbn ) {
	Title = title;
	Author= author;
	NumPages= numPages;
	Isbn= isbn;
	
}
public String toString() {

	return "Title: " + Title + "\n" + "Author: " +  Author+ "\n" + "Number of Pages: " 
				+ NumPages + "\n" + "ISBN: " + Isbn + "\n\n";
	}

}
