package JavaPractiseQuestion.HackerRank;

import java.util.Scanner;

public class StaticIntiaBlock {

	static int  b;
	static int h;
	
	
	
	static 
	{
		Scanner sc = new Scanner(System.in);
		
		b=sc.nextInt();
		h=sc.nextInt();
		
		if(h>0 && b>0) 
		{
			int res=h*b;
			System.out.println(res);
		}
		else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
