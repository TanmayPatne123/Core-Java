package JavaPractiseQuestion.Multithreading;

class Alpha1 implements Runnable{
	
	@Override
	public void run() {
		Power1();
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
	
}

class Beta1 implements Runnable{
	
	@Override
	public void run() {
		power2();
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
	
}

class Gama1 implements Runnable{
	
	@Override
	public void run() {
		Power3();
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

public class ThreadingPract3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Goku Start Training");
		Alpha1 alpha = new Alpha1();
		Beta1 beta = new Beta1();
		Gama1 gama = new Gama1();
		
		Thread thread = new Thread(alpha);
		Thread thread1 = new Thread(beta);
		Thread thread2 = new Thread(gama);
		
		thread.start();
		thread.join();
		thread1.start();
		thread1.join();
		thread2.start();

	}
}
