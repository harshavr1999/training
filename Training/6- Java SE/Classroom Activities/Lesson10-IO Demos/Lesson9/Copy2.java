import java.io.*;
import java.util.*;
class Copy2
{
	public static void main(String ag[]) throws IOException
	{
	String stName,avgclass;
	int m1,m2,m3,avg;
	int rno;
	
	RandomAccessFile f1 = new RandomAccessFile("jay.txt","rw");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	//For number of student

	System.out.print("How Many Student? :");
	int noOfstd=Integer.parseInt(br.readLine());

	for(;noOfstd>=0;noOfstd--)
		{
		System.out.println("Enter Name:");
		stName=br.readLine();
		f1.writeChars(stName);

		System.out.println("Enter Roll# :");
		rno=Integer.parseInt(br.readLine());
		f1.writeInt(rno);

		System.out.println("M1:");
		m1=Integer.parseInt(br.readLine());
		f1.writeInt(m1);

		System.out.println("M2:");
		m2=Integer.parseInt(br.readLine());
		f1.writeInt(m2);

		System.out.println("M3:");
		m3=Integer.parseInt(br.readLine());
		f1.writeInt(m3);

		avg=(m1+m2+m3)/3;
		System.out.println("Avg is :" + avg);

		}
		f1.close();

	
		

	
}
}
