
public class RemoveDash {
	
	
	public static void main(String[] args) {
		
		String s = "a-b-c-d-e-";
		
		char []a=s.toCharArray();
		

		for(int i=0;i<a.length;i++) {
			
			if(i==a.length-1 && a[i]=='-')
			{
				break;
			}
			
			System.out.print(a[i]);
		}
		
	}

}
