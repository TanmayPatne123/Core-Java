package JavaPractiseQuestion;

public class PractiseFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Parent parent = new Parent();
//		parent.age=50;
//		parent.name="pooja";
//		parent.work="house Exceutive";
//		System.out.println("Age is "+parent.age+" Name is "+parent.name+" Work is "+parent.work);
		
		Parent parent = new Parent(54, "Prafull", "Employee");
		System.out.println("Age is "+parent.age+" Name is "+parent.name+" Profession "+parent.profession);

	}


}

class Parent{
	
	public int age;
	public String name;
	public String profession;
	
	
	public Parent(int age,String name,String profession) {
		this.age=age;
		this.name=name;
		this.profession=profession;
	}
	
}


