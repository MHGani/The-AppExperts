package apollo.exercises.ch05_conditionals;

public class Ex4_GreatestCommonFactor {
	
	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call the greatestCommonFactor method a few times and print the results
		
	//
	// Examples of greatestCommonFactor:
	//   greatestCommonFactor(6, 4)   // returns 2
	//   greatestCommonFactor(7, 9)   // returns 1
	//   greatestCommonFactor(20, 30) // returns 10
	//
		greatestCommonFactor(6, 4);
		greatestCommonFactor(7, 9);
		greatestCommonFactor(20, 30);
		greatestCommonFactor(25, 45);
		greatestCommonFactor(66, 36);
		
	}
	
	// Create a method called greatestCommonFactor
	// It should return the greatest common factor
	// between two numbers. 
	
	public static void greatestCommonFactor(int a,int b) {
		
		// Hint: start a counter from 1 and try to divide both
	// numbers by the counter. If the remainder of both divisions
	// is 0, then the counter is a common factor. Continue incrementing
	// the counter to find the greatest common factor. Use a while loop
	// to increment the counter.
		
		int counter=1;
		int gcf=1;
		
		while (counter <= a && counter <= b) {
			if (((a % counter )== 0)&&((b % counter)== 0)) {
				gcf = counter;
			}
				counter++;
				
		}
		System.out.println(gcf);
	}
	
	
	

}

/*
 * SAMPLE OUTPUT:
 * 
 * 2
 * 1
 * 0
 * 
 */