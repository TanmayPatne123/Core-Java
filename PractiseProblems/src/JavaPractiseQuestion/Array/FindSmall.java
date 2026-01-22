package JavaPractiseQuestion.Array;

public class FindSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {45, 12, 78, 34, 9, 20,8};
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min+" Is the Smallest");
	}
}
