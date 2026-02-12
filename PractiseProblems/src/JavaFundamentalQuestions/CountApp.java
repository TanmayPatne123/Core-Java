package JavaFundamentalQuestions;

public class CountApp {

	public static void main(String[] args) {
		
		String s ="programminggg";
		char find ='g';

		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==find) {
				c++;
			}
		}
		
		System.out.println("Chara apper " +c);

	}

}
