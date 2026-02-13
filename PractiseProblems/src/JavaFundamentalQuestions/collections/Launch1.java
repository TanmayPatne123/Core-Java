package JavaFundamentalQuestions.collections;

import java.util.ArrayList;

public class Launch1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(2.6);
		al.add(300);
		al.add(400);
		System.out.println(al);
		
		
			double d =(double) al.get(1);	// downcasting object to primitive type		
			System.out.println(d);
		
		
	}

}
