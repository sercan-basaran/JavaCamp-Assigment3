package odev;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " +  user.getLastName() + " sisteme eklendi");
	}
	
	public static  void delete(User user){
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcının hesabı silindi");
	}
	
	public void update(User user ) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " bilgiler güncellendi");
	}
	
	public static  void singIn(User user) {
		System.out.println( user.getId() + " " + user.getFirstName() + " " + user.getLastName()  + " sisteme giriş yapıldı");
			
	}

	
		
	
	
}
