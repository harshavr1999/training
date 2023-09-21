class PersonClassInvariant 
{
	int age;


	private void checkAge()
	{
		assert age >=18 && age <= 150;
	}

	public void changeName()
	{
		try
		{
			checkAge();	
		}
		finally
		{
			System.out.println(" Some Message ");
		}
		
	}
	public static void main(String[] args) 
	{
		PersonClassInvariant obj = new PersonClassInvariant();

		obj.changeName();

		System.out.println("Hello World!");
	}
}
