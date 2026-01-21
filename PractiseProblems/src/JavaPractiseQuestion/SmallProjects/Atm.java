package JavaPractiseQuestion.SmallProjects;

import java.util.Scanner;

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
	
	
	public void Verify() 
	{
		if(acc==accountNumber && pass==password)
		{
			System.out.println("U r valid user");
		}
		else 
		{
			System.out.println("not valid user");
		}
	}
}

class Bank {
	
	public void initiate() {
		
		AtmMachine am = new AtmMachine();
		am.UserInput();
		am.Verify();
	}
	
	
}
