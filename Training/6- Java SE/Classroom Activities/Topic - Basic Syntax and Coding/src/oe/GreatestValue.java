package oe;

public class GreatestValue{
	/**
	 * Creates a new instance of GreatestValue
	 */
	 
	public GreatestValue(){
	}
	
	/**
	 * @param args the command arguments
	 */
	
	public static void main(String args[]){
		
		//declares the numbers
		int num1=10;
		int num2=23,num3=5,max=0;
		
		//determines the highest number
		max = (num1>num2)?num1:num2;
		max = (max>num3)?max:num3;
		
		//prints the output on the screen
		System.out.println("Number 1 = "+num1);
		System.out.println("Number 2 = "+num2);
		System.out.println("Number 3 = "+num3);
		System.out.println("The highest number is = "+max);
	}
	
}