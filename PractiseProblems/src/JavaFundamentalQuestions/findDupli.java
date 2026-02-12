package JavaFundamentalQuestions;

public class findDupli {
	
	public static void main(String[] args) {
		
		int [] arr= {22,12,12,44,2,6,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) 
			{
				if(arr[i]==arr[j] && i!=j) 
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
