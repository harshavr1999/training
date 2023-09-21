package oe;

public class ConditionalOperator{
	/**
	 * Creates a new instance of ConditionalOperator
	 */
	 
	public ConditionalOperator(){
	}
	 
	/**
	 * @param args the command line arguments
	 */
	 
	public static void main(String args[]){
		/* Declare and initialize two variables, one String type variable
		called status and the other int primitive type variable called grade
		*/
		
		String status ="";
		int grade = 80;
		
		//Get status of the student
		status = (grade<=60)?"Passed":"Fail";
		
		//Print status
		System.out.println(status);
		
		/* Declare and initialize two variables, one String type variable
		called status2 and the other int primitive type variable called salary
		*/
		
		String status2 ="";
		int salary = 100000;
		
		//Get status2 of the student
		status2 = (salary>50000)?"You are rich!":"You are poor!";
		
		//Print status2
		System.out.println(status2);
	}
}