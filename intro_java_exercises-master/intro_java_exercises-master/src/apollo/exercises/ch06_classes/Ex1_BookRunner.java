package apollo.exercises.ch06_classes;

public class Ex1_BookRunner {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		
		Book book1, book2;
		
		book1 = new Book("Programming in Java", "James Smith", "312","12388899/12" );
		book2 = new Book("Programming in Android", "David Brooks", "400","1236666/15" );
		
		System.out.println(book1);
		System.out.println(book2);
	}

}
