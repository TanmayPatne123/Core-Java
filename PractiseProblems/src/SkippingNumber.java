
public class SkippingNumber {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
