package SpringCore;

public class TestMain {
	
	public Boolean buyTheCourse(double amount) {
		
		Java java = new Java();  // this is tight coupled  example
		return java.getTheCourse(amount);
	}

}
