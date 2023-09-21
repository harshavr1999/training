class NestedTrySample
{
	public static void main(String p[])
	{
		try
		{
			int a=p.length;
		 	int x=Integer.parseInt(p[0]);
			int b=42/x;
			System.out.println(" The Number of elements in the array    a= "+a);
			System.out.println("b= "+b);
			

			System.out.println(" Before Inner Try ");
			try
				{
					if(a==1)
					{
						a=a/(a-a);			
					}
					
					if(a==2)
					{
						int c[]={1};
						c[42]=99;
					}

					if(a==3)
					{
						throw new NegativeArraySizeException();
					}
				}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Arrya index out of bounds Exception :"+e);						
			}

			System.out.println(" After Inner Try .... ");

		}//OUTER TRY
		catch(ArithmeticException e)
		{
			System.out.println("divide by 0 :"+e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(" Hi I can handle any exception ");
		}

		System.out.println(" I am Leaving now... ");
	}
}
