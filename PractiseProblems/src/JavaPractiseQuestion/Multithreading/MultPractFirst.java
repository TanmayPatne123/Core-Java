package JavaPractiseQuestion.Multithreading;

public class MultPractFirst {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Application start");
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		
		thread.sleep(5000);
		
		thread.setName("Tanmay");
		thread.setPriority(3);
		
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
	
		
		System.out.println("Application end");
	}
}
