package edu.gatech;

public class HelloWorld {

	public static void main(String[] args) {
		// Get two command line parameters
		Integer a = Integer.parseInt(args[0]);
		Integer b = Integer.parseInt(args[1]);
		
		// Add the two parameters and store in sum
		Integer sum = a+b;
		
		// Display the sum of the two parameters
		System.out.println(a + " + " + b + " = " + sum);		
	}

}
