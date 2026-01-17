package JavaPractiseQuestion.String;

public class RevString {
	
	
	public static void main(String[] args) {
		
		String name="tanmay";
		
		for(int i=name.length()-1;i>=0;i--) 
		{
			char charAt = name.charAt(i);
			System.out.print(charAt);
		}
	}
}
