package first_java;

public class BasicJava {

	public static void main(String[] args) {

		System.out.println("I am learning java!");
		
		
		//open a browser
		//go to shop.com
		//select Software Cat
		//enter a software name
		// hit enter or click go
		//software items should be seen on the site under results
		
		//1) What is Automated Testing?
		//2) What is Smoke Testing?
		//3) What is Regression Testing?
		
		//datatypes in java
		
		//grade = 99
		int MathGrade = 100; //declaring a variable to represent grade value
		int JavaGrade = 95;
				
		int TotalGrade = MathGrade+JavaGrade;
		
		
		long Credit_Card = 4539482714723045L;
		double bankRate = 8.09;
		float pie = 0.16798778978798797879897f;
		boolean isDone = false;
		char Answer = 'Y';
		
		System.out.println("My Total Grade: "+TotalGrade);
		
		//>, < >=, <=, ==, != //Comparison Operators
		
		
		
		if (MathGrade>JavaGrade) {
			System.out.println("You are good in Math! Need to work on Java!");
		}
		
		if (JavaGrade>MathGrade) {
			System.out.println("You are good in java, but need to work on Math!");
		}
		
	}

}
