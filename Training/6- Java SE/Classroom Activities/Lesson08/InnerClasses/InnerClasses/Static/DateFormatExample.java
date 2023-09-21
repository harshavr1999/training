import java.util.Date;
import java.text.*;
public class DateFormatExample 
{
	public static void main(String[] args) 
	{
		Date dobj = new Date();
		System.out.println(dobj);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy G");

		System.out.println(sdf.format(dobj));
	}
}
