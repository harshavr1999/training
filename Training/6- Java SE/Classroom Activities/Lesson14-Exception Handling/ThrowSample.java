class ThrowSample
{
	static void demoproc() 
	{
		try
		{
			int res=12/6;
			throw new ArithmeticException ("demo");
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught inside demopro Function");
				System.out.println(e.getMessage());

			
			throw new ArithmeticException();
		}
	}

	public static void main(String p[])
	{
		try
		{
			demoproc();

			int a[]={1};
			//a[42]=89;
		}
		catch(Exception e)
		{
			System.out.println("recaught "+e);

			
			e.printStackTrace();
		}
	}
}

