package oe;

public class MathDemo {

	public static void main(String args[]) {
		
		System.out.println("Absolute value of -5: " + Math.abs(-5));
		
		System.out.println("Absolute value of 5: " + Math.abs(5));
		
		System.out.println("Random number(max is 10): " + Math.random()*10);
		
		System.out.println("Max of 3.5 and 1.2: " + Math.max(3.5,1.2));
		
		System.out.println("Min of 3.5 and 1.2: " + Math.min(3.5,1.2));
		
		System.out.println("Ceiling of 3.5: " + Math.ceil(3.5));
		
		System.out.println("Floor of 3.5: " + Math.floor(3.5));
		
		System.out.println("e raised to 1: " +Math.exp(1));
		
		System.out.println("log 10: " + Math.log(10));
		
		System.out.println("10 raised to 3: " +	Math.pow(10,3));
		
		System.out.println("Rounded off value of pi: " + Math.round(Math.PI));
		
		System.out.println("Square root of 5 = " + Math.sqrt(5));
		
		System.out.println("10 radian = " + Math.toDegrees(10) + " degrees");
		
		System.out.println("sin(90): " + Math.sin(Math.toRadians(90)));
	}
}