package JavaPractiseQuestion.SmallProjects;

import java.util.Scanner;


class InvalidCustomerException extends Exception {
	
	public InvalidCustomerException(String msg)
	{
		super(msg);
	}
}


public class Atm {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.initiate();
	}
}

class AtmMachine{
	
	private int acc=2020;
	private int pass=1010;
	
	int accountNumber;
	int password;
	

	public void UserInput() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account number");
		accountNumber=sc.nextInt();
		System.out.println("Enter Password");
		password=sc.nextInt();
	}
	
	
	public void Verify() throws InvalidCustomerException 
	{
		if(acc==accountNumber && pass==password)
		{
			System.out.println("U r valid user, Welcome");
		}
		else 
		{
			InvalidCustomerException invalidCustomerException = new InvalidCustomerException("Invalid Credentials! ");
			System.out.println(invalidCustomerException.getMessage());
			throw invalidCustomerException; 
		}
	}
}

class Bank {
	
	public void initiate() 
	{
		AtmMachine am = new AtmMachine();
		try 
		{
		am.UserInput();
		am.Verify();
		}
		catch(InvalidCustomerException exception)
		{
			System.out.println("Try Again! ");
			try 
			{
			am.UserInput();
			am.Verify();
			}
			catch(InvalidCustomerException exception2)
			{
				System.out.println("Try Again! ");
				try 
				{
				am.UserInput();
				am.Verify();
				}
				catch(InvalidCustomerException exception3)
				{
					System.out.println("cannot be given any more chances");
				}
			}
		}
	}
}
