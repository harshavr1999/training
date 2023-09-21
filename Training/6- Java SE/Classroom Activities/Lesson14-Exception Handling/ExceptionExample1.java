import java.util.Scanner;
public class ExceptionExample1 
{
	public static void main(String[] args) 
	{
		Scanner scanObj = new Scanner(System.in);
		System.out.println(" Enter 2 Numbers : ");
	
			float result = 0.0f;

			int a = scanObj.nextInt();
			int b = scanObj.nextInt();
			
			try
			{
				result = a / b;
					
				int arr [] = { 10, 20, 30, 40, 50 };

				System.out.println(" The Value of the Array Element is " + arr[2]);
			}
			catch(ArithmeticException ex)
			{
				System.out.println(" Cant Divide By Zero ");
				ex.printStackTrace();
				System.out.println(ex.getMessage());
				return;
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println(" Cant Access Array Index ");
				ex.printStackTrace();
			}
			catch(Exception ex)
			{
				System.out.println(" Some Other Exception ");
				ex.printStackTrace();
			}
			finally
			{
				System.out.println(" Hey I am Finally Executed Always .. ");
			}
				
			System.out.println("Result is : " + result);
	}
}
