package SpringCore;

public class TestMain {
	
	
	private ICourse iCourse;
	
	public TestMain(ICourse iCourse) {  
		this.iCourse=iCourse;
	}
	
	
	public void setCourse(ICourse iCourse) // setter injection
	{
		this.iCourse=iCourse;
	}
	
	public Boolean buyTheCourse(double amount) {		
		
		return iCourse.getTheCourse(amount);
	}

}
