package JavaPractiseQuestion.Array;

public class ArraySorted {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,5,8,9,10,29};
		
		boolean isSort=true;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				isSort=false;
				break;
			}else
			{
				isSort=true;
			}
		}
		
		if (isSort)
		{
			System.out.println("list is sorted");
		}
		else 
		{
			System.out.println("not sorted");
		}
		
		
		
		
	}
	
	
	
	

}
