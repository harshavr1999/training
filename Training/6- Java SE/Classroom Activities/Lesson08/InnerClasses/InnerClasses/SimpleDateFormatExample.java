import java.text.*;

class SimpleDateFormatExample 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		
		java.util.Date dobj = new java.util.Date();

		System.out.println(dobj);

		System.out.println(sdf.format(dobj));

		double salary = 1000000000.646235;

		DecimalFormat df = new DecimalFormat("$###,###.###");

		System.out.println(salary);

		System.out.println(df.format(salary));

	}
}
