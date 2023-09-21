import java.io.*;

public class StringIOExam
{

	public static void main(String[] args) 
	{
		try
		{
		StringWriter os=new StringWriter();
		String s="Welcome to String Reader and Writer Classes";

		for(int i=0;i<s.length();i++)
		{
			os.write(s.charAt(i));
		}
		
		System.out.println(" Output Stream is : " +os);
		
		StringReader in=new StringReader(os.toString());
		int a=0;
		StringBuffer sb1=new StringBuffer(" ");
		while((a=in.read())!=-1)
		{
				sb1.append((char)a);
		}
		s=sb1.toString();
		
		System.out.println(s.length() + " is the String Length.. ");
		System.out.println(" They are : "+s);

		}
		catch(Exception e)
		{
			System.out.println(" Exception Has Raised .....");
		}
	}
}

