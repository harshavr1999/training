class SimpleExample
{
	public static void main(String[] args) 
	{
		java.util.Scanner scanObj = new java.util.Scanner(System.in);

		int var1 = scanObj.nextInt();

		int var2 = scanObj.nextInt();

		try
		{
			int result= var1/var2;		
			System.out.println(result);
		//	int arr[] = {1,2,3};
		//	System.out.println(arr[10]);
		}
		catch(ArithmeticException AE)
		{
			System.out.println(" Boss Why are you Trying to Divide a Number by Zero ");
			AE.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException AIOBE)
		{
			System.out.println(" Boss Why are you Trying to Access the Array Index Which is not Available :( ");
			AIOBE.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println(" Some Other Exception is Raised ");
			e.printStackTrace();
		}
		finally
		{
			System.out.println(" ME Here Always :) ");
		}
		System.out.println(" Hello Everyone ");
	}
}
