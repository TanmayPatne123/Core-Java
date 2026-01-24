package JavaPractiseQuestion.String;

public class BasicConcept {
	
	
	public static void main(String[] args) {
		
		String s1="Tanmay";
		String s2 ="Tanmay";
		System.out.println(s1==s2); // true compare refrence
		
		System.out.println("-------------------------------");
		
		String string1 = new String("Kunal");
		String string2 = new String("Kunal");
		System.out.println(string1==string2); // false
		System.out.println(string1.equals(string2)); 
	}
}
