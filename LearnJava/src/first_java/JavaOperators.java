package first_java;

public class JavaOperators {

	public static void main(String[] args) {
		
		/**There are 5 types of Java Operators (multi line comment)
		 * 
		 * Arithmetic Operators
		 * Assignment Operators
		 * Comparison/Relational Operators
		 * Logical Operators
		 * Bitwise Operators
		 * 
		 */
		
		
		//learning Arithmetic Operators
		// They are + - * / % ++ (increment- increase by a number) -- (decrement-decrease by a number)
		
		int a = 10;
		int b = 5;
		int result;
		
		result = a + b; //addition
		System.out.println("Addition result is " + result);//15
		result = a - b; 
		System.out.println("Subtraction result is " + result);//5
		result = a * b;
		System.out.println("Multiplication result is " + result);//50
		result = a % b; 
		System.out.println("Division result is " + result);//2
		result = a + b;
		System.out.println("Modulus result is " + result);//0
		//System.out.println("Incremental a is" + a++); //?
		//System.out.println("Decremental a is" + a--); //?
	}
}
