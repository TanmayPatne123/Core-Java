
public class NumberGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=20;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			if(i%4==0 && i!=n)
			{
				System.out.print("| ");
			}
		}
	}
}
