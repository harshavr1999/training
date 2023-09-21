import java.util.*;
class ScanDemo 
{
	public static void main(String[] args) 
	{
		Scanner scanRef = new Scanner(System.in);
		
		System.out.println("Enter Emp ID");
		int empId = scanRef.nextInt();

		System.out.println("Enter Emp Name");
		String empName = scanRef.next();

		System.out.println("Enter Emp Salary");
		float empSal = scanRef.nextFloat();

		System.out.println(empId + "\t" + empName +"\t" + empSal);
	}
}
