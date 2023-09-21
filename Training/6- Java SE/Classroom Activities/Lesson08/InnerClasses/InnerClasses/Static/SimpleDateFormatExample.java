import java.text.*;
import java.util.*;

class SimpleDateFormatExample 
{
	public static void main(String[] args) 
	{
		Date dobj = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yy");

		System.out.println(sdf.format(dobj));

		double salary = 1000000000.23344;

		DecimalFormat df = new DecimalFormat("$###,###.##");

		System.out.println(df.format(salary));
	}
}
