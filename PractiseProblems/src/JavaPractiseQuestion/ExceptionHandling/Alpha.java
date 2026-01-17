package JavaPractiseQuestion.ExceptionHandling;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Alpha start");
		Demo demo = new Demo();
		demo.Calc();
		System.out.println("Alpha end");
	}

}


class Demo{
	
	public void Calc() throws ArithmeticException {
		
		try {
		System.out.println("Demo start");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num 1");
		int n1=sc.nextInt();
		
		System.out.println("Enter num 2");
		int n2=sc.nextInt();
		
		int res=n1/n2;
		System.out.println("result is "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("add non zero value here");
		}
		finally {
			System.out.println("code is closing right now");
		}
		
		System.out.println("Demo End");
		
	}
}
	

