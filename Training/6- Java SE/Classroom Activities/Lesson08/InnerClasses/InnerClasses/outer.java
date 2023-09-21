public class outer
{
	// Member Variables
	
	private String compName="Oracle";
	
	// Member Function
	public void outprint()
	{
		System.out.println("outer");
	}
	
	class inner
	{

		// mv

		int a=23;

		public void inprint()
		{
			System.out.println("inner");
			inner2 i=new inner2();
			System.out.println(compName);
			outprint();
		}

		public void accessData()
		{
			System.out.println(a);
		}

		class inner2
		{///
			
			int a=34;
			public void subinprint()
			{
				System.out.println("inner");

				//inner in=new inner();
				System.out.println(a);
				inprint();
				accessData();
				outprint();
			}
		}

	}

	public static void main(String arg[])
	{
		outer o=new outer();
		o.outprint();
		//inner i=new inner();
		
		
		//inner2 i2 = i.new inner2();
		
		inner i=o.new inner();
		//i.outprint();

		//outer.inner i=new outer.inner();
		//i.inprint();
		//o.inprint();
		//i.outprint();
	}
}





