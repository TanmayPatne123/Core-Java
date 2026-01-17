package JavaPractiseQuestion;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		
		int n=1634,rem,temp=n,mul,sum=0,count=0,t2=n;
		
		while(temp!=0) 
		{
			temp=temp/10;
			count++;
		}
		while(n!=0) 
		{
			rem = n%10;
			mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			n=n/10;
		}
		
		if(t2==sum) 
		{
			System.out.println("its armstrong number");
		}
		else 
		{
			System.out.println("not armstrong number");
		}
	}
}
