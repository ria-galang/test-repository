package first_java;

public class ElseIf {

	public static void main(String[] args) {

		/*Else If Syntax:
		 * 
		 * if (condition)
		 * { code to be executed
		 * } else if (condition)
		 * {
		 * Code to be executed
		 * } else
		 * {
		 * Code to be executed
		 * }
		 */
		
		
		int age = 99;
		
		if (age >=18 && age <= 80) {
			System.out.println("It is high time to get married");
		} else if (age > 80 && age <= 129)
		{
			System.out.println("Pray to God that \nyou're in good health");
		}
		else
		{
		System.out.println("You are too young! \nWait for a while. ");
		}

	}

}
