// Member Level Inner Classes
public class CompDetails 
{
	// Attributes
	private String compName = "iQGateway";
	
	// Class Variables
	public static int ageLimit = 65;

	// Instance Method
	public void sayHello()
	{
		System.out.println(" Welcome to " + compName );
	}

	// Class Methods
	public static void Welcome()
	{
		System.out.println(" Welcome to Our Company Hope You Will Enjoy Working with US ");
	}

	public void accessInnerDetails()
	{
		Address addr = new Address();
		addr.displayAddress();
		System.out.println(addr.city);
	}

	private class Address 
	{
		private String city = " Bengaluru";
		private String area = " Near Swami Vivekananda Metro Station";

		public void displayAddress()
		{
			System.out.println("Name : "+ compName);
			System.out.println("Area : " + area);	
			System.out.println("City : " + city);
			System.out.println(ageLimit);
			sayHello();
			Welcome();
		}
	}
	
	public static void main(String[] args) 
	{
		CompDetails CD_Obj = new CompDetails();

		// Inner Class Object Creation with the context of Outer Class Object Reference
						// ObjRef.methodName();
		Address addrObj = CD_Obj.new Address();

		addrObj.displayAddress();

	}
}
