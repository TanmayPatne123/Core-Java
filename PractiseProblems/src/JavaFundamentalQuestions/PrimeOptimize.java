package JavaFundamentalQuestions;

public class PrimeOptimize {
	
	public static void main(String[] args) {
		
		PrimeOptimize p = new PrimeOptimize();
		int summation = p.sumDivisor(36);
		System.out.println(summation+" is the summation");
		
//		printPrime(1, 100);
	}

	public static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void printPrime(int a,int b)
	{
		for(int i=a;i<=b;i++) 
		{
			if(isPrime(i)) 
			{
			System.out.print(i+" ");
			}
		}
	}
	
	public static int sumDivisor(int n) {
		
		int sum=0;
		for(int i=1;i*i<=n;i++) 
		{
			if(n%i==0) 
			{
				if(i*i==n) 
				{
					sum=sum+i;					
				}
				else 
				{
					sum=sum+i+n/i;
				}
			}
		}
		return sum;
	}
}

