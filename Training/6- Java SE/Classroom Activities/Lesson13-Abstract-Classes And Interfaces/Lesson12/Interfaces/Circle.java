interface Shape
{
	void draw();
	void erase();
	void describe();
}

public class Circle implements Shape 
{
	public void draw()
	{
		System.out.println(" Drawing a circle ");
	}

	public void erase()
	{
		System.out.println(" Erase a circle");
	}
	
	public void describe()
	{
		System.out.println(" This Shape is a Circle ");
	}

	// Method From Circle..
	public void sayHello()
	{
		System.out.println(" Hello Everyone, Circle Welcomes U ");
	}
	
	public static void main(String arg[])
	{
		
		//Shape c1 = new Shape();

		//Circle c1 = new Circle();

		Shape c1 = new Circle();

		c1.draw();
		c1.erase();
		//c1.sayHello();
		c1.describe();
		
	}
}