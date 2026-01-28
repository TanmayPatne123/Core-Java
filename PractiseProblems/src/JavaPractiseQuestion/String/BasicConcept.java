package JavaPractiseQuestion.String;

public class BasicConcept {
	
	
	public static void main(String[] args) {
		
//		String s1="Tanmay";
//		String s2 ="Tanmay";
//		System.out.println(s1==s2); // true compare refrence
//		System.out.println(s1.equals(s2));
//		
//		System.out.println("-------------------------------");
//		
//		String string1 = new String("Kunal");
//		String string2 = new String("Kunal");
//		System.out.println(string1==string2); // false
//		System.out.println(string1.equals(string2)); 
		
//		System.out.println("----------------------");
//	
//		String a="mohit";
//		String b = new String("mohit");
//		System.out.println(a.equals(b));
//		System.out.println(a==b);
		
		String s1 = new String("lnv");
		String s2 = new String("lnv");
		
		System.out.println(s1==s2); //  memory allocation dekhata hain
		System.out.println(s1.equals(s2)); // string ke andar ki value check krta hain
		
		System.out.println("--------------------------------");
		
		String v1="dog";
		String v2="dog";
		
		System.out.println(v1==v2); //isme memory same ho jati hain value same hain override hoti hain
		System.out.println(v1.equals(v2)); // string ke andar ki value check krta hain

		System.out.println("--------------------------------");

		
		String b1="kunal";
		
		String string = new String("kunal");
		System.out.println(b1==string);
		System.out.println(b1.equals(string));
	}
}
