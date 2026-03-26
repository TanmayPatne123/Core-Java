	package StringQuestions;
	
	public class RemoveDuplicates {
	
		public static void main(String[] args) {
	
			String s ="aabbc";
	
			
			for(int i=0;i<s.length();i++) 
			{
				boolean isDuplicate=false;
				for(int j=0;j<i;j++) 
				{
					if(s.charAt(i)==s.charAt(j)) 
					{
						isDuplicate=true;
						break;
					}
				}
				if(!isDuplicate) 
				{
					System.out.print(s.charAt(i));
				}
			}
		}
	}
