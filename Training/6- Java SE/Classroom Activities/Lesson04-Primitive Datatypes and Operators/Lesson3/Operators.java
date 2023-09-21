/* This class demonstrates the use of bit wise and ternary operators */
public class Operators
{
	public static void main(String args[])
	{
           boolean a = true;
           boolean b = true;
           boolean c = false;
           boolean d = false;

		   System.out.println();
	       System.out.println("Bit Wise Operators:");
	       
		   System.out.println();
	       System.out.println("\t true  & true  = \t " + (a&b));
           System.out.println("\t true  & false = \t " + (a&c));
           System.out.println("\t true  ^ false = \t " + (a^c));
           System.out.println("\t true  ^ true  = \t " + (a^b));
           System.out.println("\t true  | false = \t " + (a|b));
           System.out.println("\t false | false = \t " + (c|d));

		   System.out.println();
           System.out.println("\t true  && true = \t " + (a&&b));
           System.out.println("\t false && true = \t " + (c&&a));

		   System.out.println();
           System.out.println("\t false || true  = \t " + (c||a));
           System.out.println("\t false || false = \t " + (c||d));        
           System.out.println("\t true  || false = \t " + (a||d));
           System.out.println("\t true  || true  = \t " + (a||b));

		   System.out.println();
		   byte byte0 = 10;

		   int i = byte0 >= 0 ? ((int) (byte0)) : -byte0; // ternary operator

		   System.out.print("\t Absolute value of ");
           System.out.println(byte0 + " is " + i);

		   byte0 = -10;
           i = byte0 >= 0 ? ((int) (byte0)) : -byte0;

		   System.out.print("\t Absolute value of ");
           System.out.println(byte0 + " is " + i);
      }
}
