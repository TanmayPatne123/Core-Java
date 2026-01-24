package JavaPractiseQuestion.String;

public class StringQuestion {
	
	public static void main(String[] args) {
		
		String s="tanmay";
		int n=2;
	
		
		for(int i=0;i<s.length();i=i+n) {
			System.out.println(s.substring(i, i+n));
		}
		
	}

}
