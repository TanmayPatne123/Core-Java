package JavaPractiseQuestion.RevisionSet;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=1634,count=0,sum=0,temp=n,temp2=n,rem;
		
		while(temp!=0) 
		{
			temp=temp/10;
			count++;
		}

		
		while(n!=0)
		{
			rem=n%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			n=n/10;
		}
		System.out.println(sum);
		
		if(temp2==sum) 
		{
			System.out.println("armstrong");
		}
		else 
		{
			System.out.println("not armstrong");
		}
	}
}
