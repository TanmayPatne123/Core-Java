package JavaPractiseQuestion.GeeksForGeeks;

public class SuqareOfNaturalNum {
	
	public static void main(String[] args) {
		
		SuqareOfNaturalNum suqareOfNaturalNum = new SuqareOfNaturalNum();
		int n=8;
		
		System.out.println(suqareOfNaturalNum.summation(n));
	}
	
	
	public int summation(int n) 
	{
        int squ,sum=0;
		
		for(int i=1;i<=n;i++) 
		{
			squ=i*i;
			sum=sum+squ;
		}
		return sum;
	}
}


