package JavaPractiseQuestion.Array;

public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {2,2,3,4,4,3,6,7};
		int count=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j) 
				{
					count++;
					if(count>0)
					{
						break;
					}
				}
			}
			if(count==0) 
			{
				System.out.print(a[i]+",");
			}
			count=0;
		}
	}
}
