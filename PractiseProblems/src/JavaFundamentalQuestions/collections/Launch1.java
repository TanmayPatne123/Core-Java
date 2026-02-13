package JavaFundamentalQuestions.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Launch1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(2.6);
		al.add(300);
		al.add(400);
		System.out.println(al);
		
		

		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------------");
		
		ListIterator listIterator = al.listIterator();
		while(listIterator.hasNext()) 
		{
			System.out.println(listIterator.next());
		}
		
		System.out.println("-----------------------");
		ListIterator listIterator1 = al.listIterator(al.size());
		while(listIterator1.hasPrevious()) 
		{
			System.out.println(listIterator1.previous());
		}
		
	}
}
