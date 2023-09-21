/* Program to Illustrate the Primitive Data Types */

public class PrimitiveDataTypes
{
	     public static void main(String args[])
	     {
		
		// Declaring Integer Data Types
		//  <Type> <Identifier> [= Optional Value ];
	         
			 byte byte_number;
	         short short_number;
	         int int_number;
	         long long_number;
	
		// Declaring Character Data type
	         char char_alphabet;

		// Declaring Floating Point Types
			 float float_decimal;
		     double double_decimal;
		
		// Declaring Boolean Types
	         boolean boolean_choice;
	
		// Initialisation of Integer Types
	        
		// Range of byte is –128 to 127
		   byte_number=100;                  
		 
		//Range of short is –32,768 to 32,767		
	      short_number=1000;            
		 
		// Range of int is –2,147,483,648 to 2,147,483,647 
	         int_number= 100_000_00;   
		//  Using Underscores in Value is for Better Readability 
		 
		//Range of  long is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	         long_number=10000000L;                            
		
		
		// Initialisation of Character Type

		// Range of character  type is 16 bits of character type values 
	         char_alphabet='a';     


	    // Initialisation of Floating Point Types

		// Range of float is 1.4e-045 to 3.4e+038
		 float_decimal=123.12f;   

		// Range of double is 4.9e–324 to 1.8e+308 
		 double_decimal=19876.21;   

	 
	
	
		// Initialisation of boolean type

		// Range of boolean type is true or false
	         boolean_choice=true; 
   
		// Printing Integer Data Types
	        
			 System.out.println("Byte    = " + byte_number);
	         System.out.println("Short   = " + short_number);
	         System.out.println("Integer = " + int_number);
	         System.out.println("Long    = " + long_number);
 	
		// Printing Character Data types
	        
			 System.out.println("Char    = " + char_alphabet);
	
		// Printing Floating Point Data Types
	        
			 System.out.println("Float   = " + float_decimal);
	         System.out.println("Double  = " + double_decimal);
	
		// Printing boolean data type
	         
			 System.out.println("Boolean = " + boolean_choice);

			 char c1 = 'a';

			 char c2 = 'b';

			 System.out.println('a' + 'b' +" c ");
	        
		}
	}
