class StaticCompDetails 
{
	private String compName = "Oracle ";

	private static int no_of_employees=1000;

	public static void sayHi()
	{
		System.out.println(" Me Static Saying Hi ");
	}

	public void sayHello()
	{
		System.out.println(" Welcome to " + compName );
	}

	public void accessInnerDetails()
	{
		Address addr = new Address();
		addr.displayAddress();
	}

	static class Address
	{
		private String city = " Bangalore";
		private String area = " WhiteField ";
		//private String compName = " Oracle";

		public void displayAddress()
		{
			System.out.println("Name : "+ compName);
			System.out.println("Area : " + area);
			System.out.println("City : " + city);
			System.out.println("Emps : " + no_of_employees);
			sayHi();
			sayHello();

		}
	}
	
	public static void main(String[] args) 
	{
		CompDetails CD_Obj = new CompDetails();

		//CD_Obj.accessInnerDetails();

		Address addrObj = new Address();

		addrObj.displayAddress();


	}
}
