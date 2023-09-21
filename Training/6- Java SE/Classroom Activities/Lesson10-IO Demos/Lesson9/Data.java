import java.io.*;
class Data 
{
	public static void main(String[] args) 
	{
		try
		{
			int data;
		DataInputStream DIS=new DataInputStream(new FileInputStream("Demo.txt"));	
		data=DIS.readInt();
		System.out.println((int)data);
		
		}
		catch(Exception e)
		{
			System.out.println(" Exception "+e);
		}
	}
}
