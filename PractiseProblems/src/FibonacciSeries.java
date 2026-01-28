
public class FibonacciSeries {

	public static void main(String[] args) {

		int n=100;
		Fibonacci(n);
		

	}
	
	public static void Fibonacci(int n) {
		
		int n1=0,n2=1;
		
		
		
		while(n1<n)
		{
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
