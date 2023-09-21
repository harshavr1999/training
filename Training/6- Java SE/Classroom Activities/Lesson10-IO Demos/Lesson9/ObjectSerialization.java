import java.io.*;

public class ObjectSerialization 
{
	public static void main(String[] args) 
	{
		try {
	    
			File F1=new File("Demo1234.txt");

			FileOutputStream out = new FileOutputStream(F1);

			ObjectOutputStream OOS = new ObjectOutputStream(out);

			String Str="Hello Everyone";

			Integer i=new Integer("100");

			OOS.writeObject(Str);
		}
		catch(FileNotFoundException FNE)
		{
			 System.out.println(" File is not Found Please Check it again ");
		}
		catch(IOException IOE)
		{
			 System.out.println(" Input Output Exception Raised ");
		}
		catch(Exception E)
		{
			 System.out.println(" SOme Exception has Raised");
		}

		  System.out.println(" Writing the state of object is Complete ");
	}
}
