class CustomerLocal
{
	int id;
	String name;
	//DateHandler dhObjRef;


	public static void main(String args[])
	{
		CustomerLocal obj = new CustomerLocal();
		
		obj.handlerMethod();
	}

	public void handlerMethod()
	{
		int ageLimit = 12;
		
		class DateHandler
		{
			public void sayHello()
			{
				System.out.println(ageLimit);
			}
		}

		DateHandler dobj = new DateHandler();
		//this.dhObjRef = dobj;
		dobj.sayHello();
	}

}
		
