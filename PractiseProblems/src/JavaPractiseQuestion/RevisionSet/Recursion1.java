package JavaPractiseQuestion.RevisionSet;

public class Recursion1 {
	
	
	
	public static void print1toN(int current,int n) {
		
		if(current>n)
		{
			return;
		}
		System.out.println(current);
		print1toN(current+1, n);
	}

	public static void main(String[] args) {
		
		print1toN(1, 5);
	}

}
