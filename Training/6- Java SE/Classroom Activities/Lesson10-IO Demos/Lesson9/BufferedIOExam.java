import java.io.*;
import java.util.*;

public class BufferedIOExam
{

	public static void main(String[] args) 
	{
		
		int bytecount=0;
		try
		{

		FileInputStream Fis1=new FileInputStream("ByteExam.java");
		
		FileInputStream Fis2=new FileInputStream("FileIOExam.java");

		FileInputStream Fis3=new FileInputStream("FileMethods.java");

		Vector v=new Vector();
		v.add(Fis3);
		v.add(Fis2);
		v.add(Fis1);
		

		Enumeration E=v.elements();

		SequenceInputStream seq=new SequenceInputStream(E);

		BufferedInputStream inst=new BufferedInputStream(seq);

		BufferedOutputStream oust=new BufferedOutputStream(System.out);

	//	inst.skip(100);

		boolean eof=false;

		
		while(!eof)
			{
				int num=inst.read();
				if(num==-1)
				{
					eof=true;
				}
				else
				{
					oust.write((char)num);
					++bytecount;

				}
			}

			String byteread = String.valueOf(bytecount);
		byteread +=" Bytes were Read";

		oust.write(byteread.getBytes(),0,byteread.length());

		


			Thread.currentThread().sleep(3000);
				System.out.println( " Bytes Were Read ");
 

			Fis1.close();
			Fis2.close();
			inst.close();
			oust.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
	}
}
	