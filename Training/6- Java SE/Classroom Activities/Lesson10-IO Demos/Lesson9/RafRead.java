import java.io.*;
import java.util.*;
class RafRead
{
public static void main(String ag[]) throws IOException
{
		RandomAccessFile f1 = new RandomAccessFile("three.txt","rw");

		f1.seek(22);
		System.out.println(f1.readInt());

		f1.seek(0);
		System.out.println(f1.readChar());

		f1.seek(10);
		System.out.println(f1.readLine());

		f1.seek(2);
		System.out.println(f1.readDouble());

		f1.close();
}
}