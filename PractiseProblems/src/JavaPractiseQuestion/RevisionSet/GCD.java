package JavaPractiseQuestion.RevisionSet;

import java.util.ArrayList;

public class GCD {

	public static <E> void main(String[] args) {
		
		int n=8,l=12;
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				list1.add(i);
			}
		}
		System.out.println(list1);
		
		System.out.println("----------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=1;i<=l;i++)
		{
			if(l%i==0) 
			{
				list2.add(i);
			}
		}
		
		System.out.println(list2);
		
		int gcd = 0;

		for(int i=0; i<list1.size(); i++) 
		{
		    for(int j=0; j<list2.size(); j++)
		    {
		        if(list1.get(i).equals(list2.get(j))) 
		        {
		            if(list1.get(i) > gcd) 
		            {
		            	gcd = list1.get(i);		            			            	
		            }
		        }
		    }
		}

		System.out.println("GCD = " + gcd);
		
	}
}
