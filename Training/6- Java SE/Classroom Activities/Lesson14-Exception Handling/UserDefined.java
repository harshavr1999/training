class IllegalAgeException extends Exception
{
	public IllegalAgeException(String a)
	{
		super(a);
	}
	
	public String showMessage()
	{
		return " Your Age is Less than 21 So We are Unable to Provide with UR Account";
	}
}

public class UserDefined
{
	public static void main(String args[]) 
	{
		try
		{
			java.util.Scanner scanObj = new java.util.Scanner(System.in);

			System.out.println(" Enter Your Age ");
			
			int age = scanObj.nextInt();

			// Checking the Condition
			if(age < 21)
			{
				   // Creation of Exception Obj
				   IllegalAgeException ExcepObj=new IllegalAgeException(" Invalid Age ");
				  
				   // Throwing the Exception Obj
				   throw ExcepObj; 
			}
			System.out.println(" Thank U For Choosing Our Bank To Bank ... Have Great Fun Banking with US....");
		}
		catch(IllegalAgeException ex )
		{
			System.out.println(ex.showMessage());
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}

	System.out.println(" After ALL the transactions completed ");
	}
}

