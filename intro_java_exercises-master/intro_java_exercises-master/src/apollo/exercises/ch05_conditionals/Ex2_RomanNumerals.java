package apollo.exercises.ch05_conditionals;

public class Ex2_RomanNumerals {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call the method and verify it prints the correct roman numeral
		
		for(int i = 0; i<=10; i++) {
			romanNum(i);
		}
		
	}
	
	// Create a method that takes a number between 1-10
	// and prints the equivalent roman numeral.
	//
	// You should check to make sure the number passed
	// in isn't greater than 10.  If it is, print an
	// error.
	//
	
	public static void romanNum(int x) {
		
		if (x > 10 || x < 1) {
			System.out.println("--Error--");
		}
		
		else {		
		if (x==1) {
			System.out.println("I");
		}
		
		if (x==2) {
			System.out.println("II");
		}
		
		if (x==3) {
			System.out.println("III");
		}
		
		if (x==4) {
			System.out.println("VI");
		}
		
		if (x==5) {
			System.out.println("V");
		}
		
		if (x==6) {
			System.out.println("VI");
		}
		
		if (x==7) {
			System.out.println("VII");
		}
		
		if (x==8) {
			System.out.println("VIII");
		}
		
		if (x==9) {
			System.out.println("XI");
		}
		
		if (x==10) {
			System.out.println("x");
		}
		
		}
		
	}
		
	}



/*
 * SAMPLE OUTPUT:
 * 
 * II
 * IV
 * X
 * 
 */