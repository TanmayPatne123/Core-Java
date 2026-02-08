package JavaFundamentalQuestions;

public class RemoveLastChar {
	
	public static void main(String[] args) {
		
		String s = "backend";
		int length = s.length();
		for(int i=0;i<s.length();i++)
		{
			if(i<s.length()-1) 
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
