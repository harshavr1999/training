import java.util.*;

public class ScanDemo 
{
	public static void main(String[] args) 
	{
		Scanner scanObj = new Scanner(System.in);

		System.out.println("Enter Your Emp ID");
		int empId = scanObj.nextInt();

		System.out.println(" Enter your Name ");
		String empName = scanObj.next();

		System.out.println(" Enter Your salary ");
		double empSalary = scanObj.nextDouble();

		System.out.println(empId + "\t" + empName + "\t" + empSalary);

	}
}
