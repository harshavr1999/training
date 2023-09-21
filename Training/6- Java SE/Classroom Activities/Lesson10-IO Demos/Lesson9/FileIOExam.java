import java.io.*;

public class FileIOExam
{

	public static void main(String[] args) 
	{
		try
		{
		// Meta Data Operations
		File f1=new File("D:\\DataStore.xls");
		f1.createNewFile();
	
		FileOutputStream os=new FileOutputStream(f1);

		String s="Welcome to File Input and Output Stream Classes Now";

	//for(int i=0;i<s.length();i++)
		{
			os.write(s.getBytes());
		}
		os.close();
 
		FileInputStream in=new FileInputStream("ByteExam.java");
		int ib=in.available();

		System.out.println(" Input Stream has :" + ib + " available Bytes ");
		byte ibuf[]=new byte[ib];

		int byrd=in.read(ibuf,0,ib);

		System.out.println(" Number of Bytes read are : " +byrd);
		System.out.println(" They are : " + new String(ibuf));

		}
		catch(Exception e)
		{
			System.out.println(" Exception Has Raised .....");
			e.printStackTrace();
		}
	}
}

