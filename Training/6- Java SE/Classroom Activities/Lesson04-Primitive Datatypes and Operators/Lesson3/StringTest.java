class StringTest 
{
	public static void main(String[] args) 
	{

		String t1 = "Test";

		String t2 = "Test";

		System.out.println(t1 +"\t"  + t1.hashCode());
		
		System.out.println(t2 +"\t"  + t2.hashCode());

		if(t1 == t2 )
		{
				System.out.println(" Same ");
		}
	}
}
