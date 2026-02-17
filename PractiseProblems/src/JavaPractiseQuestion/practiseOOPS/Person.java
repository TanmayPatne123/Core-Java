package JavaPractiseQuestion.practiseOOPS;

import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;



abstract  class Person {
	
	
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
	
}

class Student extends Person
{
	
	private Course course;
	

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}



	private long studentid;
	
	public Student() {
		
	}

	public Student(long studentid) {
		super();
		this.studentid = studentid;
		
	}
	
	
	public long getStudId() {
		return studentid;
	}
	
	public void setStudId(long studId) {
		this.studentid=studId;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid +  "]";
	}
	
	
	public void enrollCourse() 
	{
		System.out.println("Enrollement Successfully Thank You");
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Name: " + getName());
	    System.out.println("Email: " + getEmail());
	    System.out.println("Phone: " + getPhone());
	    System.out.println("Student ID: " + getStudId());

	    if(course != null) {
	        course.viewCourseDetails();
	        course.getCourseFee();
	    } else {
	        System.out.println("No Course Enrolled yet");
	    }
	
	}

}

class Instructor extends Person {
	
	
	private Course course;
	
	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	
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
		course.viewCourseDetails();
	}
	
	
	public void displayDetails()
	{
		System.out.println("Name is "+getName());
		System.out.println("Email is "+getEmail());
		System.out.println("Phone is "+getPhone());
		System.out.println("Instructor id "+getInstrtId());
		System.out.println("Specialization in "+getSpecialization());
		
		if(course != null) 
		{
	        course.viewCourseDetails();
	        course.getCourseFee();
	    }
		else 
	    {
	        System.out.println("No Course Assigned yet");
	    }
	
	}
}

abstract class Course {
	
	protected String coursename;
	protected double duration;
	protected double price;
	
	
	
	public Course() {
		
	}
	
	public Course(String coursename,double duration,double price)
	{
		this.coursename=coursename;
		this.duration=duration;
		this.price=price;
	}
	
	public String getCourseName()
	{
		return coursename;
	}
	
	public void setCourseName(String courseName)
	{
		this.coursename=courseName;
	}
	
	public double getDuration()
	{
		return duration;
	}
	
	public void setDuration(double duration) 
	{
		this.duration=duration;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	
	public void viewCourseDetails() 
	{
		System.out.println("Course Name is "+getCourseName());
		System.out.println("Course Duration is "+getDuration()+" Months");
		System.out.println("Course price is "+getPrice());
	}
	
	
	abstract public void getCourseFee();
}

class JavaCourse extends Course {
	
	
	@Override
	public void getCourseFee()
	{
		double discount , certification=1500, totalFees;
		if(duration>4) 
		{
			discount=price*0.10;
		}
		else {
			discount=price*0.05;
		}
		
		totalFees = price - discount + certification;

	    System.out.println("Discount Applied: " + discount);
	    System.out.println("Certification Fees: " + certification);
	    System.out.println("Total Fees to Pay: " + totalFees);
	}
	
}


class PythonCourse extends Course{

	double discount , certification=1500, totalFees;
	@Override
	public void getCourseFee() {
		if(duration>3) 
		{
			discount=price*0.20;
		}
		else
		{
			discount=0.10;
		}
		
		totalFees = price - discount + certification;

	    System.out.println("Discount Applied: " + discount);
	    System.out.println("Certification Fees: " + certification);
	    System.out.println("Total Fees to Pay: " + totalFees);
	    
	}
}

