package JavaFundamentalQuestions;

public class findDupli {
	
	public static void main(String[] args) {
		
		int [] arr= {12,12,1,44,2,0,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j] ) 
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
