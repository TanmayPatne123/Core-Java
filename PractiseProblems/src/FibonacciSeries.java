
public class FibonacciSeries {

	public static void main(String[] args) {

		int n=5;
		Fibonacci(n);
		

	}
	
	public static void Fibonacci(int n) {
		
		int n1=0,n2=1;
		
		for(int i=0;i<=n;i++) 
		{
			System.out.println(n1+" ");
			int n3=n2+n1;
			n1=n2;
			n2=n3;
		}
	}

}
