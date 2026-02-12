package JavaFundamentalQuestions;

public class findDupli {
	
	public static void main(String[] args) {
		
		int [] arr= {0,12,12,44,2,0,6};
		int found=0;
		for(int i=0;i<arr.length;i++)
		{
			if(found==arr[i])
				continue;
			for(int j=0;j<arr.length;j++) 
			{
				if(arr[i]==arr[j] && i!=j) 
				{
					found=arr[i];
					System.out.println(arr[i]);
				}
			}
		}
	}
}
