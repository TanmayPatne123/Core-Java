package JavaFundamentalQuestions;

public class PrimeOptimize {
	
	public static void main(String[] args) {
		
		if(isPrime(53)) {
			System.out.println("prime ");
		}else {
			System.out.println("not prime");
		}
		
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
}

