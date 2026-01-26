
public class Print1to30 {
	
	public static void main(String[] args) {
		
		int n=30;
		
		for(int i=1;i<=n;i++) 
		{
			if(i%3==0 || i%5==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
