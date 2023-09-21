class AppEntry 
{
	public static void main(String[] args) 
	{
		Customer tempCustomer = new Customer(123);

		// 1. Declaration of an Array
		Customer custArray[] = null;

		// 2.  Creation of an Array
		custArray = new Customer[10];

		// 3.  Initialization
		custArray[0] = new Customer(1);
		custArray[1] = new Customer(2);
		custArray[2] = tempCustomer;



		System.out.println("Hello World!");
	}
}

class Customer
{
	public Customer(int id)
	{
			System.out.println(id);
	}
}
