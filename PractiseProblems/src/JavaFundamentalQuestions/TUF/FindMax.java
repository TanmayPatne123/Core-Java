package JavaFundamentalQuestions.TUF;

import javax.swing.text.html.parser.Element;

import JavaPractiseQuestion.Array.FindLargest;

public class FindMax {
	
	       public int largestElement(int[] nums) 
	       {
	    	   int max=nums[0];
	    	   
	   		for(int i=1;i<nums.length;i++) 
	   		{
				if(nums[i]>max)
				{
					max=nums[i];
				}
			}
	    	   
			return max;
			
	       }
	       
	       
	       public static void main(String[] args) {
			
	    	   FindMax findMax = new FindMax();
	    	   int[]nums= {3,3,6,22,1};
	    	   System.out.println(findMax.largestElement(nums));
		}
	       
}
	


			
			
		
