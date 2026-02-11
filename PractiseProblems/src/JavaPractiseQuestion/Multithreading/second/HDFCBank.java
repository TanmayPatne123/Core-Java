package JavaPractiseQuestion.Multithreading.second;

public class HDFCBank {
	
	int accountBal;
	
	
	public HDFCBank(int accountBal)   
	{
		this.accountBal=accountBal;
	}
	
	synchronized public void withdrawal(int withdrawal)
	{
		accountBal=accountBal-withdrawal;
	}
	
	synchronized public void deposits(int deposits) 
	{
		accountBal=accountBal+deposits;
	}
	
	synchronized public void checkBalance() 
	{
		System.out.println("Balance is "+accountBal);
	}
	
	

}
