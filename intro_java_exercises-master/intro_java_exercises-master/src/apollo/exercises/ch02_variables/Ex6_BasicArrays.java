package apollo.exercises.ch02_variables;

// This is a program that shows how programs handle
// basic arrays.
public class Ex6_BasicArrays {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		// Step 1: Declare an integer array variable called "nums" with 3 elements
		int [] nums = new int[3];
		
	    // Step 2: Set the value of each of the elements
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		// Step 3: Print each of the 3 values to the console.
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
	}

}

/*
 * 
 * SAMPLE OUTPUT:
 *  
 *   The sum of x and y is: 8
 *   The difference of x and y is: 2
 *   The product of x and y is: 15
 *   The quotient of x and y is: 1
 *   The remainder of x divided by y is: 2
 *   
 *   The quotient of a and b is: 1.6667
 *    
 */