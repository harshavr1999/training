import java.io.*;

class Car implements Serializable
{
	public String Model;
	public transient float price;
	public int speed;
	
	public static int nextID = 1000;
	
	public Car()
	{
		speed=240;
		Model="Tata Safari";
		price=1800000;
	}
}

public class CarWriter 
{
    public static void main(String[] args) 
		{

		Car obj=new Car();
        
		String str=new String("Hello My Friends In IQ Gateway ...");
	
		try 
			{
			FileOutputStream out = new FileOutputStream("ObjectData.txt");
	
			ObjectOutputStream oos = new ObjectOutputStream(out);
	
			oos.writeObject(obj);
		
			oos.writeObject(str);
		
			
			System.out.println("writing complete");	
		
			oos.flush();
		}
		catch (Exception e)
		{
			 System.out.println("Problem serializing: " + e);
		}
    }
}
