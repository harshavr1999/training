import java.util.*;

public class HashSetOper
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
	 	String s1=new String("1");
		Integer s2=new Integer("1");
		String s3=new String("1");
		String s4=new String("1");
		Integer s5=new Integer("2");
		Integer s6=new Integer("2");
		
		h.add(s1);
		h.add("2");
		h.add(s2);
		h.add(s3); // Discards
		h.add(s4); // Discards
		h.add(s5); 
		h.add("3");
		h.add(s6); // Discards

		System.out.println(" The Hash Set is as Follows : ");
		System.out.println(h + "\n");
		System.out.println(" The Size of the Hash Set is : " + h.size());

	}
}
