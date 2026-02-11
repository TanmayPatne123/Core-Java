package JavaPractiseQuestion.Multithreading.second;

public class Atm  extends Thread {
	
	
	private HDFCBank bank;

	public Atm(HDFCBank bank)
	{
		this.bank=bank;
	}
	
	@Override
	public void run() {
		System.out.println("Withdrawal ");
		bank.withdrawal(4000);
	}

}
