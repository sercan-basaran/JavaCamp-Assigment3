package eTicaret.business.concretes;


import java.util.List;

import eTicaret.business.abstracts.UserService;
import eTicaret.core.ConfirmationEmailManager;
import eTicaret.core.GoogleLoginManagerAdapter;
import eTicaret.core.ValidatorManager;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private ConfirmationEmailManager confirmationEmailService;
	private GoogleLoginManagerAdapter googleLoginManagerAdapter;

	public UserManager(UserDao userDao, ConfirmationEmailManager confirmationEmailService) {
		super();
		this.userDao = userDao;
		this.confirmationEmailService = confirmationEmailService;
	}
	
	public UserManager(UserDao userDao, GoogleLoginManagerAdapter googleLoginManagerAdapter) {
		super();
		this.userDao = userDao;
		this.googleLoginManagerAdapter = googleLoginManagerAdapter;
	}

	@Override
	public void register(User user) {
		if(!ValidatorManager.validatePassword(user.getPassword())) {
			System.out.println("Parola en az 6 karakter olmalıdırr.");
			return;
		}
		
		if(!ValidatorManager.validateEMail(user.geteMail())) {
			System.out.println("Hatalı e-mail!");
			return;
		}
		
		if(!ValidatorManager.validateNameLenght(user.getFirstName(), user.getLastName())) {
			System.out.println("Ad-Soyad 2 karakterden kısa olamaz!");
			return;
		}
		
		if(ValidatorManager.isUsedEMail(userDao.getAllEMail(), user.geteMail())) {
			System.out.println("E-mail daha önce kullanılmıyor.");
			return;
		}
		
		this.confirmationEmailService.sendEMail(user.geteMail());
		if(this.confirmationEmailService.checkConfirmation()==false) {
			System.out.println("Mail adresi doğrulaması tamamlanmadı.");
			return;
		}
		this.userDao.add(user);
		
		
		
	}

	@Override
	public void login(User user, boolean isGoogleUsed) {
		if(isGoogleUsed==true) {
		this.googleLoginManagerAdapter.login(user.geteMail(), user.getPassword());
		}else {
			System.out.println("Login olundu: " +user.getFirstName() );
		}
		
	}

	@Override
	public void logout(User user) {
		
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}