import java.io.*;

public class CharArrayExam
{

	public static void main(String[] args) 
	{
		try
		{
		CharArrayWriter os=new CharArrayWriter();
		String s="Welcome to Character Array Reader and Writer Classes";

		for(int i=0;i<s.length();i++)
		{
			os.write(s.charAt(i));
		}
		
		System.out.println(" Output Stream is : " +os);
		System.out.println(" Size of Output Stream is : " + os.size());

		CharArrayReader in=new CharArrayReader(os.toCharArray());
		int a=0;
		StringBuffer sb1=new StringBuffer(" ");
		while((a=in.read())!=-1)
		{
				sb1.append((char)a);
		}
		s=sb1.toString();
		
		System.out.println(s.length() + " Characters were read.. ");
		System.out.println(" They are : "+s);

		}
		catch(Exception e)
		{
			System.out.println(" Exception Has Raised .....");
		}
	}
}

