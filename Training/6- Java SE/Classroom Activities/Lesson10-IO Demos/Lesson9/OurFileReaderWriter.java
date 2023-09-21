import java.io.*;

public class OurFileReaderWriter
{

	public static void main(String[] args) 
	{
		try
		{
		File f1=new File("D:\\Data.txt");
		f1.createNewFile();
	
		FileWriter os=new java.io.FileWriter("D:\\Data.txt");

		String s="Welcome to File Input and Output Stream Classes Now";

	//for(int i=0;i<s.length();i++)
		{
			os.write(s);
		}
		os.close();
 
		FileReader in=new FileReader(f1);
		//int ib=in.available();

//		System.out.println(" Input Stream has :" + ib + " available Bytes ");
//		String ibuf[]=new String[ib];

//		int byrd=in.read(ibuf,0,ib);
		char dataBuf[] = new char[100];

		int dataRead = in.read(dataBuf);

		//System.out.println(" Number of Bytes read are : " +byrd);
		System.out.println(" They are : "+new String(dataBuf));

		}
		catch(Exception e)
		{
			System.out.println(" Exception Has Raised .....");
			e.printStackTrace();
		}
	}
}

