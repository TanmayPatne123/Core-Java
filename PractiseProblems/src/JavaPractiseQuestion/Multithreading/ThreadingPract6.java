package JavaPractiseQuestion.Multithreading;

class MsWord extends Thread{
	
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		if(name.equals("type")) 
		{
			typing();
		}else if(name.equals("spell")) 
		{
			spellingCheck();
		}else
		{
			saving();
		}
	}
	
	
	public void typing() {
		try {
			
			for(int i=0;i<3;i++)
			{
				System.out.println("Typing....");
				Thread.sleep(3000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void spellingCheck() {
		try {
			for(;;)
			{
				System.out.println("Spelling checking....");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void saving() {
		try {
			
			for(;;)
			{
				System.out.println("saving....");
				Thread.sleep(3000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}

public class ThreadingPract6 {

	public static void main(String[] args) {
		
		MsWord m1 = new MsWord();
		MsWord m2 = new MsWord();
		MsWord m3 = new MsWord();
		
		m1.setName("type");
		m2.setName("spell");
		m3.setName("saving");
		
		m2.setDaemon(true);
		m3.setDaemon(true);
		
		m2.setPriority(3);
		m3.setPriority(4);
		
		m1.start();
		m2.start();
		m3.start();
	}
}
