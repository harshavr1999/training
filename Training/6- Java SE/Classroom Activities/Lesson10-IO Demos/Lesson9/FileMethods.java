import java.io.*;
class FileMethods
{
	public static void main(String ag[])
	{
		File f1=new File("D:\\Data.txt");
		File f2=new File("D:\\course");
		
		try
		{
			if(f1.createNewFile())
			{
				System.out.println(" File Got Created .....");
			} 
			else
			{
				System.out.println(" Some Problem in Creating File ");
			}

	// Now Shall we Create a Directory

	
		if(f2.mkdir())
		{
			System.out.println(" Our Directory got Created ");
		}
		else
		{
			System.out.println(" SOme Problem in Creating a Directory ");
		} 
	}
	catch(IOException e)
	{
		System.out.println(" Exception is Raised ");
	}

		System.out.println(f2.isDirectory()?"directory":"Not a directory");
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.exists()?"exists":"do not exist");
		System.out.println(f1.canRead()?"read":"not read");
		System.out.println(f1.canWrite()?"write":"not read");


}
}

