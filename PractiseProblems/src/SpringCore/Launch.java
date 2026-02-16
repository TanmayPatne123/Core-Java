package SpringCore;

public class Launch {
	
	public static void main(String[] args) {
		
		TestMain testMain = new TestMain();
		
		testMain.setCourse(new Java()); // Achieve Dependency Injection.
		
		Boolean status = testMain.buyTheCourse(2000);
		
		if(status) {
			System.out.println("Course Enrolled Successfully");
		}else {
			System.out.println("Failed to enroll");
		}
	}
	
	

}
