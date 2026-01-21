package JavaPractiseQuestion.Array;

public class ArrayPract {

	public static void main(String[] args) {


		int []ar = new int[3];
		
		ar[0]=11;
		ar[1]=222;
		ar[2]=818;
//		ar[3]=882;
		
		int a[]= new int[] {2,3,4,5}; 
//		System.out.println(a.getClass().getName());
		
		int b[]= {31,33,44,57};
		
		
		System.out.println("/////////////////////////////////////");
		Goku goku = new Goku();
//		System.out.println(goku.getClass().getName());
		System.out.println("-----------------------");

		int bk[][] = new int[4][4];
//		System.out.println(bk.getClass().getName());
		
		double d[][] = new double[4][4];
//		System.out.println(d.getClass().getName());
		
		int e[]= {2,4,3,5};
		
		for(int coll:e)
		{
			System.out.print(coll);
		}
		System.out.println();
		for(int i=0;i<e.length;i++) {
			System.out.print(e[i]);
		}
	}
}

class Goku{
	
	String mode;
	int power;
	
}
