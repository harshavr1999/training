import java.util.*;
public class ScanDemo 
{
	public static void main(String[] args) 
	{
		Scanner scanObj = new Scanner(System.in);

		System.out.println(" Enter Your Emp ID");

		int empId = scanObj.nextInt();

		System.out.println(" Enter Your Name ");

		String empFName = scanObj.next();
		String empLName = scanObj.nextLine();
		String empFullName = empFName + empLName;

		System.out.println(" Enter Your Salary ");

		double empSal = scanObj.nextDouble();

		System.out.println(empId + "\t" + empFullName + "\t" + empSal);
	}
}
