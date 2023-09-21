import java.io.*;

class Car implements Serializable
{
	public int speed;
	public String Model;
	public float price;
	public static int serialVersionUID = 100;
	
	public Car()
	{
		speed=240;
		Model="Tata Safari";
		price=800000;
	}
}

public class CarWriter 
{
    public static void main(String[] args) 
		{

		Car obj=new Car();

        String str=new String("Hello My Friends In Oracle...");
	
		try 
			{
	    
			FileOutputStream out = new FileOutputStream("D:\\Data.txt");
	
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
