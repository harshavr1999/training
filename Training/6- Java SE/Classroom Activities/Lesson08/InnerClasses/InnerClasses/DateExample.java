import java.util.Date;
import java.text.*;
class DateExample 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat SDF = new SimpleDateFormat("dd-MMMM-yyyy");
		Date Dobj = new Date();
		System.out.println(SDF.format(Dobj));

		double salary = 1000000.3434343;

		DecimalFormat df = new DecimalFormat("$###,###.##");
		System.out.println(salary);

		System.out.println(df.format(salary));

	}
}
