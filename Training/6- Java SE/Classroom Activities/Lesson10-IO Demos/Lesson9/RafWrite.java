import java.io.*;
import java.util.*;
class RafWrite
{
public static void main(String ag[]) throws IOException
{

	RandomAccessFile f1 = new RandomAccessFile("three.txt","rw");
	char ch[] = {'h','e','l','l','o'};
	f1.writeChar('X');
	f1.writeDouble(12.4343);
	f1.writeChars("hello\n");//for entire line
	f1.writeInt(1000);
	f1.close();
}
}