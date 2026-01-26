package JavaPractiseQuestion.String;

public class StringGrouping {
	
	
	public static void main(String[] args) {
		
		String s = "abcdefghij";
		int size=1;
		
		
		for(int i=0;i<s.length();i=i+size) 
		{
			System.out.print(s.substring(i, i+size));
			if(i+size<s.length())
			{
				System.out.print(" - ");
			}
		}
	}
}
