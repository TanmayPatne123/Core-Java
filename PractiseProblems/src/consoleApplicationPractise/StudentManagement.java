package consoleApplicationPractise;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	
	public static void main(String[] args) {
		
		System.out.println("============Student Management System===========");
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.Add Students");
			System.out.println("2.View Students");
			System.out.println("3.Update Students");
			System.out.println("4.Delete Students");
			System.out.println("5.Exit");
			System.out.println("Please Select From Above");
			choice=sc.nextInt();
		switch (choice) 
		{
		case 1: 
		{
			System.out.println("Add student");
			break;
		}
		case 2:{
			System.out.println("View Student");
			break;
		}
		case 3:
		{
			System.out.println("Update Student");
			break;
		}
		case 4:
		{
			System.out.println("Delete Student");
			break;
		}
		case 5:
		{
			System.out.println("Exit");
			break;
		}
		default:
			System.out.println("Invalid Number Enter");
		}
	}
		while (choice!=5);
}
	static ArrayList<Student> students = new ArrayList<>();
	
	public static void addStudent(Scanner sc) {
	    System.out.print("Enter Student ID: ");
	    int id = sc.nextInt();
	    
	    sc.nextLine(); // buffer clear
	    System.out.print("Enter Student Name: ");
	    String name = sc.nextLine();
	    
	    System.out.print("Enter Student Age: ");
	    int age = sc.nextInt();
	    
	    Student s = new Student(name, age, id);
	    students.add(s);
	    
	    System.out.println(" Student Added Successfully!");
	}


}

class Student{
	
	 int id;
	 String name;
	 int age;
	
	public Student() {
		
	}
	
	public Student(String name,int age,int id) {
		this.age=age;
		this.name=name;
		this.id=id;
	}
	
}
