package JavaPractiseQuestion.Array;

public class ArrayInIncrOrDecre {

	public static void main(String[] args) {
		
		int []a= {1,2,3,5,6,10,8};
		
		boolean isIncre=true;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1]) 
			{
				isIncre=true;
			}
			else 
			{
				isIncre=false;
			}
		}
		
		if(isIncre)
		{
			System.out.println("sorted in increasing order");
		}else
		{
			System.out.println("not sorted in incresing order");
		}
	}
}
