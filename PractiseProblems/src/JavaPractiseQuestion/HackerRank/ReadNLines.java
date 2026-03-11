package JavaPractiseQuestion.HackerRank;

import java.util.Scanner;

public class ReadNLines {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		long inc=0;
//		String s="";
//		while(s!=null)
//		{
//		s = sc.next();
//		inc++;
//		System.out.println(inc+" "+s);
//		}
		
		int incr=1;
		while(sc.hasNextLine()) 
		{
			String line = sc.nextLine();
			System.out.println(incr +" "+ line);
			incr++;
		}

	}

}
