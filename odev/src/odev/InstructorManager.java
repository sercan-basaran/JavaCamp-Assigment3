package odev;


public class InstructorManager extends UserManager {
	
	public void Login(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getCourseName() + " E�itimi giris yapildi");
	}
}