import java.util.*;

public class HashTableEg
{
	public static void main(String[] args) 
	{
		Hashtable t=new Hashtable();
		t.put("Vasanth",new Integer(90));
		t.put("Anitha",new Integer(50));
		t.put("Sanjana",new Integer(78));
		t.put("Srijha",new Integer(67));
		t.put("Anitha",new Integer(90));
		t.put("Anju",new Integer(80));

		Enumeration e=t.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}
}
