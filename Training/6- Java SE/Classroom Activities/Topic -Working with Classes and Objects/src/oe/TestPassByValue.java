package oe;

public class TestPassByValue {
	public static void main(String[] args) {
		int i = 10;
		double j = 20.0;

		// Print the value of i
		System.out.println("start of the main method and i = " + i);
		// Print the value of j
		System.out.println("start of the main method and i = " + j);
	
	/* 
	Call method test, which is defined below and pass int,double values as a parameters. This parameter is passed by value.
	*/
	
	test( i,j );
	
	// print the value of i. please note that i not changed
	System.out.println("end of the main method and i = " + i);
	
	// print the value of j. please note that j not changed
	System.out.println("end of the main method and j = " + j);
	
	}

	// Another static method in the TestPassByValue class
	public static void test(int j,double k){
		System.out.println("start of the test method and j = " + j);
		System.out.println("start of the test method and k = " + k);
		
		// change value of parameter j
		j = 33;
		
		// change value of parameter k
		k = 35.0;
		
		System.out.println("end of the test method and j = " + j);
		System.out.println("end of the test method and k = " + k);
	}
}