package JavaPractiseQuestion.String;

public class StringRemoveDash {
	
	public static void main(String[] args) {
		
		String s = "t-a-n-m-a-y-";
		
	
		for(int i=0;i<s.length();i++) 
		{
			if(i==(s.length()-1) && s.charAt(i)=='-') 
			{
			 break;
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
