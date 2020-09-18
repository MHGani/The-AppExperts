package apollo.exercises.ch05_conditionals;

public class Ex3_Blackjack {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		
		// Given 2 int values greater than 0, return whichever 
		// value is nearest to 21 without going over. 
		// Return 0 if they both go over. 
		//
		
		// Call the method a few times and print the results
		
		System.out.println(blackjack(7,5));
		System.out.println(blackjack(10,15));
		System.out.println(blackjack(11,24));
		
	}
	
	// Create a method like:
	//   public int blackjack(int a, int b)
	//
	
	public static int blackjack (int a, int b) {
		int x = 0;
		
		if (a>21 && b>21) {
			x = 0;	
		}
		else {
			if (a<21) {
				
				if (a > b) {
					x = a;
				}
				else {
					x = b;
				}
			}
			return x;
		}
		return x;
		
	}
}



/*
 * SAMPLE OUTPUT:
 * 
 * 6
 * 8
 * 0
 * 
 */