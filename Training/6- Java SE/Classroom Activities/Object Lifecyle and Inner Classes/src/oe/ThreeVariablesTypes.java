package oe;

public class ThreeVariablesTypes { 
	// Example of static variable 
	static String myStaticVariable = "static variable"; 
	// Example of instance variable 
	String myInstanceVariable = "instance variable"; 
	/** Creates a new instance of ThreeVariablesTypes */ 
	public ThreeVariablesTypes() {
	} 
	/** 
	* @param args the command line arguments 
	*/ 
	public static void main(String[] args) { 
		String myLocalVariable = "local variable"; 
		ThreeVariablesTypes obj = new ThreeVariablesTypes();
		System.out.println("myStaticVariable = " + myStaticVariable); 
		System.out.println("myInstanceVariable = " + obj.myInstanceVariable); 
		System.out.println("myLocalVariable = " + myLocalVariable); 
	} 
}