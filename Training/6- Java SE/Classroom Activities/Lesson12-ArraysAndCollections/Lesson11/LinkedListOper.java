import java.util.*;
public class LinkedListOper
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("Apple");
		l.add("Mango");
		l.add("Banana");

		System.out.println(" The Linked List after adding the First 3 elements is as follows : \n"+ l +"\n");

		l.addFirst("Papaya");
		l.addLast("Grapes");

		System.out.println(" The Linked List after adding 2 more elements is as follows : \n"+ l +"\n");

		System.out.println(" The Third element in the Linked List is : " + l.get(2) + "\n");

		l.remove("Mango");

		System.out.println(" The Linked List after removing the element 'Mango' is as follows : \n"+ l +"\n");
		
		l.add(3,"Orange");
	
		System.out.println(" The Linked List after changing the fourth element is as follows : \n"+ l +"\n");

	}
}
