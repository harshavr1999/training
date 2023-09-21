package oe;

public class ConstructorExample2 {

	public static void main(String[] args) {

	// Create an object instance of StudentRecord class.
	//StudentRecord2 annaRecord = new StudentRecord2("Anna");

	// Increament the studentCount by invoking a static method.
	StudentRecord2.increaseStudentCount();

	// Create another object instance of StudentRecord class.
	StudentRecord2 beahRecord =new StudentRecord2("Beah", 45);

	// Increament the studentCount by invoking a static method.
	StudentRecord2.increaseStudentCount();

	// Create the 3rd object instance of StudentRecord class.
	StudentRecord2 crisRecord =new StudentRecord2("Cris", 23.3, 67.45, 56);
	
	// Increament the studentCount by invoking a static method.
	StudentRecord2.increaseStudentCount();

	// Print Cris' name and average
	System.out.println("Name = " + crisRecord.getName() + " Average = " + crisRecord.getAverage());
	
	// Create an 4th object instance of StudentRecord class.
	StudentRecord2 annaRecord = new StudentRecord2("Anna",23.3, 67.45,56, crisRecord.getAverage());
	
	// Print Anna's name and average
	System.out.println("Name = " + annaRecord.getName() + " Average = " + annaRecord.getAverage());

	// Print number of students.
	System.out.println("Student Count = "+StudentRecord.getStudentCount());
	}

}