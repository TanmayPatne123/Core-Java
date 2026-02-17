package JavaPractiseQuestion.practiseOOPS;

public class Portal {

	public static void main(String[] args) {

		Course course = new JavaCourse();
		course.setCourseName("Java");
		course.setDuration(5);
		course.setPrice(10000);
//		Student student = new Student();
//		student.setName("Tanmay");
//		student.setEmail("tanmay@gmail.com");
//		student.setPhone("456784567");
//		student.setStudId(1);
//		student.setCourse(course);
//		student.displayDetails();

		
		Instructor instructor = new Instructor();
		instructor.setInstrtId(1);
		instructor.setSpecialization("Java");
		instructor.setName("David");
		instructor.setEmail("David@gmail.com");
		instructor.setPhone("62883737383");
		instructor.setCourse(course);
		instructor.displayDetails();
	}

}
