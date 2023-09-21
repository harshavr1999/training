import java.util.Date;

import java.time.*;

class DateDemo 
{
	public static void main(String[] args) 
	{
		LocalDateTime meeting = LocalDateTime.of(2014, JUNE, 13, 12, 30);

		System.out.println(meeting);

		Date dobj = new Date();

		System.out.println(dobj);
	}
}
