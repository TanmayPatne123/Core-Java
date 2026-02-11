package JavaPractiseQuestion.Multithreading.second;

public class LaunchOLL {

	public static void main(String[] args) 
	{
		HDFCBank hdfcBank1 = new HDFCBank(4000);	
		
		Atm atm = new Atm(hdfcBank1);
		atm.setName("Atm Thread");
		
		GooglePay googlePay = new GooglePay(hdfcBank1);
		googlePay.setName("GPAY Thread");
		
		PhonePe phonePe = new PhonePe(hdfcBank1);
		phonePe.setName("Phonepe Thread");
		
		atm.start();
		googlePay.start();
		phonePe.start();
		
		
	}

}
