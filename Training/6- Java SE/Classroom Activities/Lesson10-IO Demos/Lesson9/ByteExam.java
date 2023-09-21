import java.io.*;

public class ByteExam
{

	public static void main(String[] args) 
	{
		ByteArrayOutputStream os=new ByteArrayOutputStream();

		String s="Welcome to Byte Array Input and Output Stream Classes";
		
		for(int i=0;i<s.length();i++)
		{
			os.write(s.charAt(i));
		}

		System.out.println(" Output Stream is : " +os);

		System.out.println(" Size of Output Stream is : " + os.size());


		ByteArrayInputStream in=new ByteArrayInputStream(os.toByteArray());

		int ib=in.available();

		System.out.println(" Input Stream has :" + ib + " available Bytes ");
		
		byte ibuf[] = new byte[ib];

		int byrd = in.read(ibuf,10,14);

		System.out.println(" Number of Bytes read are : " +byrd);
		System.out.println(" They are : "+ new String(ibuf));

		//int someAvail = in.available();

		//System.out.println(someAvail);
	}
}

