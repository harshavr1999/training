package oe;

public class StudentRecord {
	/** Creates a new instance of StudentRecord */
	public StudentRecord() {
	}

	// Declare instance variables.
	private String name;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;

	// Declare static variables.
	private static int studentCount = 0;
	
	/**
	* Returns the name of the student
	*/

	public String getName(){
		return name;
	}
	
	/**
	* Changes the name of the student
	*/
	
	public void setName(String temp ){
		name =temp;
	}

	/**
	* Computes the average of the english, math and science
	* grades
	*/
	
	public double getAverage(){
	double result =0;
	result =(getMathGrade()+getEnglishGrade()+getScienceGrade() )/3;
	return result;
	}
	
	/**
	* Returns the number of instances of StudentRecords
	*/

	public static int getStudentCount(){
		return studentCount;
	}

	/**
	* Returns the number of instances of StudentRecords.
	* This is a static method.
	*/
	
	public static void increaseStudentCount(){
	studentCount++;
	}

	// Instance methods
	public double getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}
	
	public double getEnglishGrade() {
		return englishGrade;
	}
	
	public void setEnglishGrade(double englishGrade) {
		this.englishGrade = englishGrade;
	}
	
	public double getScienceGrade() {
		return scienceGrade;
	}

	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
}