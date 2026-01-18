package JavaPractiseQuestion.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPract {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add("tanmay");
		hs.add("tejas");
		hs.add(199.08);
		hs.add("Kunal");
		hs.add("tejas");
		hs.add(null);
		hs.add(null); 
		
		Iterator iterator = hs.iterator();
		while(iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
		
		System.out.println(hs);
	}

}
