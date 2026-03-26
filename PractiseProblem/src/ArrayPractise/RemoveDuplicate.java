package ArrayPractise;

public class RemoveDuplicate {
	
	
	public static void main(String[] args) {
		
		int []a = {1,2,2,3};

		
		for(int i=0;i<a.length;i++) 
		{
			boolean isDupli=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j]) 
				{
					isDupli=true;
					break;
				}
			}
			if(!isDupli) 
			{
				System.out.print(a[i]);
			}
		}
	}
}
