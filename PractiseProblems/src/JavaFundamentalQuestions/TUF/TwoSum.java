package JavaFundamentalQuestions.TUF;

public class TwoSum {
	
	
	
		
		public static void main(String[] args) {
			
		int[] nums= {3,3};
		int t=6;
		boolean isSum=true;
		
		for(int i=0;i<nums.length;i++) {
		
		for(int j=1;j<nums.length;j++) 
		{
			if(t==nums[j]+nums[i] && j!=i)
			{
				int[] result= {i,j};
				System.out.println(result[0]+" "+result[1]);
				return;
			}
		}
	}
		}
}
