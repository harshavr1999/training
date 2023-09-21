import java.io.*;
class Copy
{
public static void main(String ag[]) throws IOException
	{
	File infile = new File("one.txt");
	File outfile = new File("two.txt");
	if(infile.exists())
		{
		FileReader in = new FileReader(infile);
		FileWriter out = new FileWriter(outfile);
		int c;//object for iut file
		while((c=in.read())!=-1)
		out.write(c);
		in.close();
		out.close();
		}
	else
		{
		System.out.println("File does not exits");
		}
	}
}