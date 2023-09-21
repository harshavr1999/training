import java.io.*;

public class CarReader {
    public static void main(String[] args) {
	String str=null;

	try {

		FileInputStream in = new FileInputStream("ObjectData.txt");

		ObjectInputStream ois = new ObjectInputStream(in);

		Car result = null;
		
	    result = (Car)(ois.readObject());
		
		String str1=(String)ois.readObject();
		
		System.out.println(" Speed is : "+result.speed+ "  Model is " + result.Model + "Price is : " + result.price + "\t " + Car.nextID);

		System.out.println(str1);

		
	} catch (Exception e) {
	    System.out.println("Problem serializing: " + e);
		e.printStackTrace();
	}

	//System.out.println("Card read is: "+);

    }
}
