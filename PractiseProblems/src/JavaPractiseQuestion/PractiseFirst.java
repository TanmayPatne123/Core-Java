package JavaPractiseQuestion;

public class PractiseFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Parent parent = new Parent();
//		parent.age=50;
//		parent.name="pooja";
//		parent.work="house Exceutive";
//		System.out.println("Age is "+parent.age+" Name is "+parent.name+" Work is "+parent.work);
		
		Parent parent = new Parent();
		parent.setAge(52);
		parent.setHobbies("reading");
		parent.setName("Pooja Patne");
		parent.setProfession("HouseWife");
		parent.setSalary(500000);
		
//		System.out.println("Age is "+parent.getAge());
//		System.out.println("Hobbies is "+parent.getHobbies());
//		System.out.println("Name is "+parent.getName());
//		System.out.println("Profession is "+parent.getProfession());
//		System.out.println("Salary is "+parent.getSalary());
		
		System.out.println(parent);
	}
}

class Parent
{
	private int age;
	private String name;
	private String profession;
	private double salary;
	private String hobbies;
	
//	public Parent(int age,String name,String profession) {
//		this.age=age;
//		this.name=name;
//		this.profession=profession;
//	}
//	
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public String getProfession()
	{
		return profession;
	}
	
	public void setProfession(String prof)
	{
		this.profession=prof;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
	public String getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(String hobbies) 
	{
		this.hobbies=hobbies;
	}

	@Override
	public String toString() {
		return "Parent [age=" + age + ", name=" + name + ", profession=" + profession + ", salary=" + salary
				+ ", hobbies=" + hobbies + "]";
	}
	
}


