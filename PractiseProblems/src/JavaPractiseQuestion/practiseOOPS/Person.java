package JavaPractiseQuestion.practiseOOPS;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;



public class Person {
	
	
	private String name;
	private String email;
	private String phone;
	
	
	public Person() {
		
	}
	
	public Person(String name,String email,String phone) 
	{
		this.email=email;
		this.name=name;
		this.phone=phone;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	
	public void displayDetails()
	{
		System.out.println("Name is "+getName());
		System.out.println("Email is "+getEmail());
		System.out.println("Phone is "+getPhone());
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		
//		Student s = new Student();
//		s.setName("Tanmay");
//		s.setEmail("tanmay@gmail.com");
//		s.setPhone("4567856789");
//		System.out.println("Enter student id");
//		long stuId=sc.nextLong();
//		s.setStudId(stuId);
//		sc.nextLine();
//		System.out.println("Enter course name");
//		String course=sc.nextLine();
//		s.setCourseName(course);
//		System.out.println("Enter Fees");
//		double fees=sc.nextDouble();
//		s.setFees(fees);
//
//		if(course.equalsIgnoreCase("java")) {
//			System.out.println("Enroll in Java Course");
//			s.displayDetails();
//			s.enrollCourse();
//		}else if(course.equalsIgnoreCase("python")) {
//			System.out.println("Enroll in Python Course");
//			s.displayDetails();
//			s.enrollCourse();
//		}
		
	
		Instructor instructor = new Instructor();
		Person p=instructor; // runtime polymorphism
		instructor.setName("David");
		instructor.setPhone("6272722");
		instructor.setEmail("david@123gmail.com");
		
		System.out.println("Enter Instroctor id");
		long i=sc.nextLong();
		instructor.setInstrtId(i);
		sc.nextLine();
		
		String specialization = "";

		do 
		{
		    System.out.println("Enter Specialization");
		    specialization = sc.nextLine();
		    if(specialization.trim().isEmpty()) 
		    { // trim() se sirf spaces bhi catch hote hain
		        System.out.println("Can't be null or empty, try again!");
		    }
		}
		while (specialization.trim().isEmpty());

		instructor.setSpecialization(specialization);
		instructor.assignCourse();
		p.displayDetails();
		
	}
}

class Student extends Person
{
	
	private long studentid;
	private String coursename;
	private double fees;
	
	public Student() {
		
	}

	public Student(long studentid, String coursename, double fees) {
		super();
		this.studentid = studentid;
		this.coursename = coursename;
		this.fees = fees;
	}
	
	
	public long getStudId() {
		return studentid;
	}
	
	public void setStudId(long studId) {
		this.studentid=studId;
	}
	
	public String getCourseName() {
		return coursename;
	}
	
	public void setCourseName(String courseName) {
		this.coursename=courseName;
	}
	
	public double getFees() {
		return fees;
	}
	
	public void setFees(double fees) {
		this.fees=fees;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", coursename=" + coursename + ", fees=" + fees + "]";
	}
	
	
	public void enrollCourse() 
	{
		System.out.println("Enrollement Successfully Thank You");
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Name is "+getName());
		System.out.println("Email is "+getEmail());
		System.out.println("Phone is "+getPhone());
		System.out.println("Student id is "+getStudId());
		System.out.println("Course Name is "+getCourseName());
		System.out.println("Fees is "+getFees());
	}

}



class Instructor extends Person {
	
	private long instructorid;
	private String specialization;
	
	
	public Instructor() {
		
	}


	public Instructor(long instructorid, String specialization) {
		super();
		this.instructorid = instructorid;
		this.specialization = specialization;
	}	
	
	
	
	public long getInstrtId() {
		return instructorid;
	}
	
	public void setInstrtId(long instrutId) {
		this.instructorid=instrutId;
	}
	
	
	public String getSpecialization() {
		return specialization;
	}
	
	
	public void setSpecialization(String specialization) {
		this.specialization=specialization;
	}


	@Override
	public String toString() {
		return "Instructor [instructorid=" + instructorid + ", specialization=" + specialization + "]";
	}
	
	
	public void assignCourse()
	{
		if(specialization.equalsIgnoreCase("java"))
		{
			System.out.println("Java Course Assigned");
		}
		else if(specialization.equalsIgnoreCase("python"))
		{
			System.out.println("Python Course Assigned");
		}
	}
	
	
	public void displayDetails()
	{
		System.out.println("Name is "+getName());
		System.out.println("Email is "+getEmail());
		System.out.println("Phone is "+getPhone());
		System.out.println("Instructor id "+getInstrtId());
		System.out.println("Specialization in "+getSpecialization());
	}
}
