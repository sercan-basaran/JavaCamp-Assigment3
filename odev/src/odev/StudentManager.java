package odev;


public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " +  student.getLastName() + " " + student.getCourseDetails()  + " eğitiminiz başarıyla eklenildi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName() + " " + student.getCourseDetails() + " Eğitimi isteğiniz üzere geri silindi");
	}
	public void delete1(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName() + " " + student.getCustomerAccount() + " " +"Kullanıcı hesabını sildi");
	}
	
	public void uploadHomework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Ödev Güncellendi");
	}

	public void addHomework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Ödev Tamamlandı");
	}

	public void signOut(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Sistemden çıktı");
		}
		
   public void signIn(Student student3) {
			System.out.println(student3.getFirstName() + " "+ "hanım Hoşgeldiniz");
   }
	
   public void signIn1(Student student1) {
		System.out.println(student1.getFirstName() + " "+ "bey Hoşgeldiniz");

	}
		
		
	
}