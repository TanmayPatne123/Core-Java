
public class StringRevise {

	public static void main(String[] args) {

		String s = "abcdefgh";
		
		int size=3;
		
		for(int i=0;i<s.length();i=i+size) 
		{
			if(i+size<=s.length()) 
			{
			System.out.print(s.substring(i,i+size)+" | ");
			}
			else 
			{
				System.out.print(s.substring(i));
			}
		}
	}
}
