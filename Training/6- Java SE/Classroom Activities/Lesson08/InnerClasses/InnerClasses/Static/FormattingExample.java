import java.text.*;
import java.util.*;
class FormattingExample 
{
	public static void main(String[] args) 
	{
		Date currDate = new Date();

		System.out.println(currDate);

		System.out.println("After Formatting ");

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");

		System.out.println(sdf.format(currDate));


		// Formatting Numbers

		double salary = 100000000.232323;

		System.out.println(salary);

		DecimalFormat df = new DecimalFormat("$###,###.##");

		System.out.println(df.format(salary));


	}
}
