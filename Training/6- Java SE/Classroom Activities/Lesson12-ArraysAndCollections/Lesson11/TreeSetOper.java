import java.util.*;
public class TreeSetOper
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		String  i=new String("7");
		Integer i1=new Integer("9");
		t.add(new Integer("2"));
		t.add(i);
		t.add(i1);
		t.add(new Integer("3"));
		t.add("2");
		t.add("22");
		t.add("1");
 		t.add("4");
		t.add("8");
		t.add("3");

		t.add("Brijesh");
		t.add("Vishal");
		t.add("Shankar");
		t.add("Santhosh");

		t.add("%");

		System.out.println(" The Tree Set is as Follows : ");
		System.out.println(t + "\n");

		t.remove("3");
		System.out.println(" The tree set after removing the element '3' is as Follows :");
		System.out.println(t + "\n");

		t.add("3");
		t.add("5");
		t.add("4"); // Discards
		t.add("7"); // Discards
		
		System.out.println(" The Tree Set after Adding more elements is as Follows : ");
		System.out.println(t + "\n");
		
		System.out.println(" The part of the tree set upto the element '4' is as follows ");
		System.out.println(t.headSet("4"));

		System.out.println(" The part of the tree set from the element '4' is as follows ");
		System.out.println(t.tailSet("4"));

	}
}
 