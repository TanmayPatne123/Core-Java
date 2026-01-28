package JavaPractiseQuestion.Multithreading;

class Alpha3 implements Runnable{
	
	@Override
	  synchronized  public void run() {
		String name = Thread.currentThread().getName();
		if(name.equalsIgnoreCase("p1")) {
			Power1();
		}else if(name.equalsIgnoreCase("p2")) {
			power2();
		}else {
			Power3();
		}
	}
	
	public void Power1() 
	{
		int pushUps=0,sum=100;
		for(int i=1;i<=3;i++)
		{
			pushUps=sum+pushUps;
			if(pushUps==300) 
			{
				System.out.println(pushUps+"pushups Done Well Done");
				System.out.println("Super saiyan 1 Mode is Activated");
			}
			else
			{
				try 
				{
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(pushUps+" pushups done "+" First complete 300 pushups");
			}
		}
	}
	
	public void power2() 
	{
    int pushUps=0,sum=100;
		
	
		for(int i=1;i<=5;i++) {
			pushUps=sum+pushUps;
			if(pushUps==500) 
			{
				System.out.println("well done");
				System.out.println("Super saiyan 2 Mode is Activated");
			}else {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("First complete 500 pushups");
			}
		}
	}
	
	public void Power3() 
	{
		int pushUps=0,sum=100;
		for(int i=1;i<=10;i++) 
		{
			pushUps=sum+pushUps;
			if(pushUps==1000) 
			{
				System.out.println("well done");
				System.out.println("Super saiyan 3 Mode is Activated");
			}else {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("First complete 1000 pushups");
			}
		}
		
		System.out.println("Yes this is a way to become Got");
	}
	
}


public class ThreadingPract4 {

	public static void main(String[] args) {
		
		System.out.println("Goku Start Training");
		Alpha3 alpha = new Alpha3();
		
		
		Thread thread = new Thread(alpha);
		Thread thread1 = new Thread(alpha);
		Thread thread2 = new Thread(alpha);
		
		thread.setName("p1");
		thread1.setName("p2");
		thread2.setName("p3");
		
		thread.start();
		thread1.start();
		thread2.start();

	}
}
