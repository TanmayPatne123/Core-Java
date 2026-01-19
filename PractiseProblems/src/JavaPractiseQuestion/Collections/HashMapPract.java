package JavaPractiseQuestion.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapPract {
	
	
	public static void main(String[] args) {
		
		
		HashMap <Integer,String> hm = new HashMap();
		hm.put(101, "tanmay");
		hm.put(102, "kunal");
		hm.put(103, "iussdiu");
		hm.put(102, "chinmay");
		hm.put(105, null);
		
		System.out.println(hm);
		
		
		Set entrySet = hm.entrySet();
		System.out.println(entrySet);
		
	 
	}

}
