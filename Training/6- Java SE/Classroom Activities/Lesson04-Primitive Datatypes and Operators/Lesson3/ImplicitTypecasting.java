/* This class demonstrates the Implicit Type Casting */
public class ImplicitTypecasting 
{
	public static void main(String[] args)
	{
		// Some Declared Variables

		double d1 = 2.12;
		float f1 = 150.5f;
		long  l1 = 150L;
		int   i1= 550;
		char  c1= 100;
		short s1 = 100;          
		byte  b1= 12;           
	
		System.out.println();
		System.out.println("Default Typecasting");
		System.out.println(" \nByte to Short    : \t -> " + (s1 = b1) );
		System.out.println(" \nShort to Integer : \t -> " + (i1 = s1) );
		System.out.println(" \nInteger to Long  : \t -> " + (l1 = i1) );
		System.out.println(" \nLong to Float    : \t -> " + (f1 = l1) );
		System.out.println(" \nFloat to Double  : \t -> " + (d1 = f1) );
		System.out.println(" Character : \t -> " + c1);

	}
}	
