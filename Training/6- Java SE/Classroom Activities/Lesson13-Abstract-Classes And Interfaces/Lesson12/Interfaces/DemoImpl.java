interface Test1
{
	int TESTVAR=23;

	String displaytext();

	void sayHello();
	
}

interface Test2 extends Test1  {
	// displaytext(), sayHello()

 	int TESTVAR = 45;
	
	void sayHello(String name);

	void showInfo();
	
}

class DemoImpl implements Test2
{

/*	public void printItemReport(){
   
		System.out.println(" Inside Impl  Default Method ... ");    
  }*/

	public String displaytext()
	{
		return "Java is Powerful Language and King of OO";
	}

	public void sayHello()
	{
		System.out.println(" Hello My Friends in Oracle ");
		System.out.println(Test1.TESTVAR);
	}

	public void showInfo()
	{
		System.out.println(" Hello Everyone here ");
	}

	public void sayHello(String name)
	{
		System.out.println(" Hello My Friends in Oracle " + name);
		System.out.println(Test2.TESTVAR);
	}

	// Additional Method of Class
	public void welcome()
	{

	}

	public static void main(String arg[])
	{

		DemoImpl obj = new DemoImpl();
	//	obj.printItemReport();


		obj.sayHello(); 
		//obj.sayHello();
		obj.showInfo();

		System.out.println(Test1.TESTVAR);
		
		obj.sayHello("Oracle");
		System.out.println(obj.displaytext());
		
	}
}





