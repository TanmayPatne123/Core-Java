package SpringCore;

public class TestMain {
	
	
	private ICourse iCourse;
	
	public void setCourse(ICourse iCourse) 
	{
		this.iCourse=iCourse;
	}
	
	public Boolean buyTheCourse(double amount) {		
		
		return iCourse.getTheCourse(amount);
	}

}
