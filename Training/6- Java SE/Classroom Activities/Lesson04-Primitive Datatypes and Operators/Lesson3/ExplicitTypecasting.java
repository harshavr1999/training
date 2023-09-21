/* This Program Illustrtates the Usage of Explicit Typecasting */

public class ExplicitTypecasting
{
	public static void main(String[] args) 
	{
		double d1 = 2.99;
		float f1 = 150.5F;
		long  l1 = 150L;
		int  i1= 550;
		char  c1= 200;
		short s1 = 100;          
		byte  b1= 12;     
	
		System.out.println();
		System.out.println(" \n Explicit Narrow typecasting:");   
		System.out.println(" \n Conversion from Double to Float  :  -> " + (f1 = (float)d1) ); 
		System.out.println(" \n Conversion from Float  to Long   :  -> " + (l1 = (long)f1) );
		System.out.println(" \n Conversion from Long to Integer  :  -> " + (i1 = (int)l1) ); 
		System.out.println(" \n Conversion from Integer to Short :  -> " + (s1 = (short)i1) );
		System.out.println(" \n Conversion from Short to Byte    :  -> " + (b1 = (byte)s1) );
		System.out.println();

		System.out.println(" \n Explicit Narrowing typecasting:");
		System.out.println(" \n Cast byte to char                : \t -> " + (char)b1 );
		System.out.println(" \n Cast short to char               : \t -> " + (char)s1 );
	}
}
