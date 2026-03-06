package SpringCore;

public class Launch {
	
	public static void main(String[] args) {
		
		TestMain testMain = new TestMain(new SpringBoot()); // This is Constructor injection
		
//		testMain.setCourse(new SpringBoot()); // Achieve Dependency Injection.
		
		Boolean status = testMain.buyTheCourse(2000);
		
		if(status)
		{
			System.out.println("Course Enrolled Successfully");
		}
		else 
		{
			System.out.println("Failed to enroll");
		}
	}
}
