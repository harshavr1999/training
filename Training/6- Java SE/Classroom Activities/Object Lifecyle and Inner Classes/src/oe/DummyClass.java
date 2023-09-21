package oe;

public class DummyClass {

	void mymethod1(){
	
		// Note that mymethod2() and this.mymethod2() are the same thing.
		String s1 = mymethod2("Sang Shin");
		String s2 = this.mymethod2("Sang Shin");
		System.out.println("s1 = " + s1 + " s2 = " + s2);
 
	}

	String mymethod2(String name){
		return "Hello " + name;
	}
	
	// Compile error - you cannot invoke instance method from a static method.
	/*
	static void mymethod3(){
		String s1 = mymethod2("Sang Shin");
		String s2 = this.mymethod2("Sang Shin");
		System.out.println("s1 = " + s1 + " s2 = " + s2);
	}
	*/

}