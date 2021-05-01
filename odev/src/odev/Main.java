package odev;

public class Main {

	public static void main(String[] args) {
		
		  StudentManager studentManager = new StudentManager();
		  Student student1 = new Student("12345" , "JavaScript","Öğrenci");
		  student1.setId(45);
		  student1.setFirstName("Semih");
	 	  student1.setLastName("Saygın");
		  student1.setStudentNumber("12a56");
		  student1.setPassword(123);
		  student1.setCourseDetails("Ticari Site Yapımı");
		  studentManager.signIn1(student1);
		  studentManager.add(student1);
		  studentManager.addHomework(student1);
		  studentManager.delete(student1);
		  studentManager.signOut(student1);
		  
		  User user1 = new User("a3f4e" , "C#");
		  user1.setId(15);
		  user1.setFirstName("Mehmet");
		  user1.setLastName("Olguner");
		  user1.setPassword("@12f4f");
		  user1.setCourseDetails("Arduino Öğreniyorum");
		  UserManager.singIn(user1);
		  UserManager.delete(user1);
       
		  
		  Student student3 = new Student("34565" , "Html","Öğrenci");
		  student3.setId(48);
		  student3.setFirstName("Serpil");
		  student3.setLastName("Arslan");		 
		  student3.setPassword("@2342tgt");
		  student3.setCourseDetails("İlk Site Nasıl Yapılır");
		  studentManager.signIn(student3);
		  studentManager.update(student3);
		  studentManager.add(student3);
		  studentManager.uploadHomework(student3);
		  
		 
		  
		  
		  
		  
	}

}
