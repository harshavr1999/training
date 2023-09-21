public class LocalInnerDemo 
{
	
	String condition = "NA";

	public void sayHello()
	{
		System.out.println("Welcome");
	}


	public void someMethod()
	{
		int ageLimit = 60;
		//String condition = "AVAILABLE";

		class InnerDemo
		{
			float price = 34.56f;

			public void access()
			{
				System.out.println(price);
				System.out.println(ageLimit);
				
				System.out.println(condition);
				sayHello();
			}

		}

		InnerDemo inObj = new InnerDemo();
		inObj.access();

	}

	public static void main(String[] args) 
	{
		LocalInnerDemo locObjRef = new LocalInnerDemo();

		locObjRef.condition = "ABC";

		locObjRef.someMethod();

		
		
	}
}
