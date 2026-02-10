package JavaPractiseQuestion.Multithreading;

class Library implements Runnable{
	
	
	String r1 = new String("java");
	String r2 = new String("dsa");
	String r3 = new String("Spring boot");


	@Override
	public void run() {

      String name = Thread.currentThread().getName(); 
		if(name.equals("stud1")) {
			try
			{
				Thread.sleep(3000);
				synchronized (r1)
				{
					System.out.println("stud1 have aquired"+r1);
					Thread.sleep(4000);
					synchronized (r2) 
					{
						System.out.println("stud1 have aquired"+r2);
						Thread.sleep(4000);
						synchronized (r3) 
						{
						System.out.println("stud1 have aquired"+r3);	
						}
					}
				}
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		else {
			try 
			{
				Thread.sleep(3000);
				synchronized (r1)
				{
					System.out.println("stud2 have aquired"+r1);
					Thread.sleep(4000);
					synchronized (r2) 
					{
						System.out.println("stud2 have aquired"+r2);
						Thread.sleep(4000);
						synchronized (r3) 
						{
						System.out.println("stud2 have aquired"+r3);	
						}
					}
				}
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	

}

public class ThreadingPract5 {

	public static void main(String[] args) {
		
		Library l = new Library();
		
		Thread thread1 = new Thread(l);
		Thread thread2 = new Thread(l);

		thread1.setName("stud1");
		thread2.setName("stud2");
		
		thread1.start();
		thread2.start();

	}
}
