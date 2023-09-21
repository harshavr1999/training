import java.io.*;
/*class Car implements Serializable
{
	public int speed;
	public String Model;
	public transient float price;

	
}*/

public class CarReader {
    public static void main(String[] args) {
	String str=null;

	try {

		Car.serialVersionUID++;
		FileInputStream in = new FileInputStream("D:\\Data.txt");

		ObjectInputStream ois = new ObjectInputStream(in);

		Car result=null;

    	//System.out.println(" Speed is : "+result.speed+ "  Model is " + result.Model+ " Price is :"+result.price);
		
	    result = (Car)(ois.readObject());

		String str1=(String)ois.readObject();
		
		System.out.println(" Speed is : "+result.speed+ "  Model is " + result.Model + "Price is : " + result.price + " UID : "  + result.serialVersionUID);

		System.out.println(str1);
///		result.Display();

	} catch (Exception e) {
	    System.out.println("Problem serializing: " + e);
		e.printStackTrace();
	}

	//System.out.println("Card read is: "+);

    }
}
