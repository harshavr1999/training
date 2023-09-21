package oe;

public class EqualsTestInteger {
	/** Creates a new instance of EqualsTestInteger */
	public EqualsTestInteger() {
	}

	/**
	* @param args the command line arguments
	*/
 
	public static void main(String[] args) {

		// Declare two Integer type variables, num1 and num2
		Integer num1, num2;

		// Initialize the variables. Note that the variables contain Pointers to the actual object instances.
		num1 = 100;
		num2 = num1;

		// Display the values of the num1 and num2 variables
		System.out.println("Integer 1 : " + num1);
		System.out.println("Integer 2 : " + num2);

		// The "==" notation, when it is used with variables of reference types not
		// primitive types, means whether the variables point to the same object instance or not.

		// Check if num1 and num2 are the same object meaning if the two variables
		// points to the same Integer type object instance.
		System.out.println("Same object? " + (num1 == num2));
	
		// Reinitialize num2 variable. It is now pointing to a new Integer type object instance.
		num2 = new Integer(num1);

		// Display the values of the num1 and num2 variables
		System.out.println("Integer 1 : " + num2);
		System.out.println("Integer 2 : " + num2);

		// Check if num1 and num2 are the same object meaning if the two variables
		// points to the same Integer type object instance.
		System.out.println("Same object? " + (num1 == num2));

		// Check if num1 and num2 have the same vaule
		System.out.println("Same value? " + num1.equals(num2));
	}

}