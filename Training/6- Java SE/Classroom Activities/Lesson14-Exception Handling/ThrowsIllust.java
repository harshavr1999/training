class ThrowsIllust
{

	public void MyMethod(String args[]) throws
	ArithmeticException , ArrayIndexOutOfBoundsException, NegativeArraySizeException
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int Res=a/b;
		System.out.println(Res);
		int arr[]={10,2,3,5};
		arr[20]=23;
		System.out.println(arr[2]);
		int arr1[]=new int[-20];
 	}


	
	public static void main(String args[]) 
	{
		
		ThrowsIllust obj=new ThrowsIllust();
		try
		{
				obj.MyMethod(args);
		}
		catch(ArithmeticException AE)
		{
			System.out.println(" Divide By zero Error has Raised ");
		}
		catch(ArrayIndexOutOfBoundsException ARE)
		{
			System.out.println(" Array out of Bounds ...");
		}
		catch(NullPointerException NPE)
		{
			System.out.println(" Null Pointer Exception Raised...");
		}
		catch(NegativeArraySizeException E)
		{
			System.out.println(" Some other Exception is thrown from the block of statements ");
			E.printStackTrace();
		}
		catch(Exception ME)
		{
			System.out.println(" I can Handle any Kind of Exception ");
			ME.printStackTrace();
		}
		


	}
}	