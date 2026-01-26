
public class RemoveFirstDash {
	
	public static void main(String[] args) {
		
		String s = "-a-b-c-d-e";
		
		char []arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			 if(i == 0 && arr[i] == '-')
			 {
			      continue;
			 }
			 System.out.print(arr[i]);
		}
	}
}
