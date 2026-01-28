package JavaPractiseQuestion.Multithreading;

public class MultPractFirst {
	
	public static void main(String[] args) {
		
		System.out.println("Application start");
		
		try 
		{
			Thread.sleep(3000);			
		} catch (InterruptedException e) 
		{
			System.out.println("Hello I Catch it dont worry");
		}
		
		System.out.println("Application end");
	}

}
