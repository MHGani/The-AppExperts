package apollo.exercises.ch02_variables;

// This is a program that compliments someone's age.
public class Ex2_AgeComplimentor {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Declare an integer called "age"
	    // Set the age to any number you want.
				int age = 30;
		
			// Declare an integer called complimentaryAge
				int complimentaryAge;
		
		// Set complimentaryAge to be 5 years less than age.
		// Do this by using the subtraction operator.
				complimentaryAge = age - 5;
		
		// Print out something based on the variables set:
		//   40?  You don't look a day over 35!
		System.out.println(age + "? " + " you don't look a day over " + 
				complimentaryAge + "!" );
				
		// Bonus:  Try setting age in the same line that you declare it.
	}

}

/*
 * 
 * SAMPLE OUTPUT:
 *  
 *   50?  You don't look a day over 45!
 *   40?  You don't look a day over 35!
 *   35?  You don't look a day over 30!
 *    
 */