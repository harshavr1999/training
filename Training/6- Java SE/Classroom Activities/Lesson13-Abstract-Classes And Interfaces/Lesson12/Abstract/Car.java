/* <Access Modifier> abstract class <Class Name>
{
		Member Variables
		<Acess Modifier > Datatype Variables;

		public Constructors(){
			
		}

		Concrete Member Functions
		<Access Modifier > <Acess Modifier > <Return Type> < Function Name>(Parameter List) {
			Defination.....
		}

		Can Include Your Abstract Functions
		<Access Modifier > abstract <Return Type> < Function Name>(Parameter List);
}
*/

abstract class Vehicle
{
	public Vehicle(){
		System.out.println(" Vehicle No Arg Constructor ");
	}
	
	// Abstract Methods
	 public abstract void start();
	
	 public abstract void stop();
	
	// Concrete Methods
	 public void buy()
	 {
		System.out.println(" Buying a Vehicle ");
	 }
	
}

abstract class Motor extends Vehicle
{
	public void start()
	{
		System.out.println("starting a vehicle");
	}

	// public abstract void stop();
}

public class Car extends Vehicle
{
	public int cubicCapacity = 2199;
	
	public Car(){
		System.out.println(" Car No Arg Constructor is Called ");
	}
	
	// Method from Vehicle but Defined Here
	
	// Forcable Override
	public void start()
	{
		System.out.println(" Starting My Hexa Car");
	}

	// Forcable Override
	public void stop()
	{
		System.out.println(" Stopping My Hexa Car");
	}

	// Method of Car Class 
	public void sayHello()
	{
		System.out.println(" Happy Driving ! ");
	}

	// Optional Override
	public void buy()
	{	
		System.out.println(" I am Purchasing a Car ");
	}

	public static void main(String arg[])
  	{
		//Vehicle v1 = new Vehicle();
		
		// Storing Sub Class Object in Base Class Reference
		Vehicle v1 = new Car();
		
		//Car v1 = new Car();
		
		v1.buy();
		v1.start();
		//v1.sayHello();
		v1.stop();
		
	}
}

