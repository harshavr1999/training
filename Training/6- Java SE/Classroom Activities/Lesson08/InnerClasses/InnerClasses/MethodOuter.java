class MethodOuter 
{
	int age;


	public void localInnerClass()
	{
		final int creditLimit = 10000;

		class Inner
		{
			int balance = 123;

			public void accessData()
			{
				System.out.println(balance);
				System.out.println(creditLimit);
				System.out.println(age);
			}

		}

		Inner iobj = new Inner();
		iobj.accessData();

	}
	public static void main(String[] args) 
	{
		MethodOuter outer= new MethodOuter();
		outer.localInnerClass();

	}
}
