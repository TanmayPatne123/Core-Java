package JavaFundamentalQuestions;

public class PrimeOptimize {
	
	public static void main(String[] args) {
		
//		if(isPrime(53)) {
//			System.out.println("prime ");
//		}else {
//			System.out.println("not prime");
//		}
		
		printPrime(1, 100);
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
	
	public static void printPrime(int a,int b) {
		
		for(int i=a;i<=b;i++) 
		{
			if(isPrime(i)) 
			{
			System.out.print(i+" ");
			}
		}
	}
}

