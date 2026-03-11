package JavaPractiseQuestion.HackerRank;

import java.util.Scanner;

public class ReadNLines {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long inc=0;
		String s="";
		while(s!=null)
		{
		System.out.println("Enter String u Want");
		s = sc.next();
		inc++;
		System.out.println(inc+" "+s);
		}
	}

}
