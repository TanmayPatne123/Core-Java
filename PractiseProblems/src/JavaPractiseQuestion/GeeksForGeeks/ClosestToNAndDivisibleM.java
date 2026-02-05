package JavaPractiseQuestion.GeeksForGeeks;

public class ClosestToNAndDivisibleM {
	
	public int findClose(int num) {
		int m=6,store=0;
		
		for(int i=1;i<=num;i++) 
		{
			if(i%m==0) 
			{
				store=i;
			}
		}
		return store;
	}
	

	public static void main(String[] args)
	{
		ClosestToNAndDivisibleM nAndDivisibleM = new ClosestToNAndDivisibleM();
		System.out.println(nAndDivisibleM.findClose(15)+" Is the Closest Value");
	}
}
