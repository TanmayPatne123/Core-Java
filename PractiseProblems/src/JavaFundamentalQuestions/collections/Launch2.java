package JavaFundamentalQuestions.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Launch2 {
	
	public static void main(String[] args) {
		
	  Vector v = new Vector();
	  
	  v.addElement(100);
	  v.addElement(200);
	  v.addElement(300);
	  v.addElement(400);
	  
	  
	  Iterator iterator = v.iterator();
	  while(iterator.hasNext())
	  {
		  System.out.println(iterator.next());
	  }
	  
	  System.out.println("-------------------------------");
	  
	  Enumeration elements = v.elements();
		while(elements.hasMoreElements()) 
		{
			System.out.println(elements.nextElement());
		}
	}
}
