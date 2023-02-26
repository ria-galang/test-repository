package first_java;

public class ForLoopDemo {

	public static void main(String[] args) {
	
		/** 
		 * for(initialization/ start point, how far/end point, how will it increase/decrease )
		 * {
		 * code to be executed
		 * }
		 */

		// write "I love you" 10 times using for loop
		System.out.println("Starts");
		for(int i = 1; i<=10; i++) {
			System.out.println( i + " I love you");
		}
		System.out.println("Ends!!");
		
		
		
		
		
		/** Syntax for while loop:
		 * initialization; 
		 * while(condition){
		 * //Statement
		 * increment/decrement
		 * }
		 * 
		 * Syntax for do while loop:
		 * initialization; 
		 * do{
		 * //Statement
		 * increment/decrement
		 * } while (condition)
		 * 
		 * Type I am from... + variable 3 times using
		 * for, while and do while loop
		 * use String variable to refer to
		 * your place
		 */
		
		System.out.println("Starts");
		for(int i = 1; i<=3; i++) {
			System.out.println( i + " I am from Queens");
		}
		System.out.println("Ends!!");
		

		
	}

}
