package eTicaret;

import eTicaret.business.concretes.UserManager;
import eTicaret.core.ConfirmationEmailManager;
import eTicaret.core.GoogleLoginManagerAdapter;
import eTicaret.dataAccess.concretes.HibernateUserDao;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Sercan", "Baþaran", "srcnbsrn@gamil.com", "68484654");
		User user1 = new User(2, "Serkan", "Yýlmaz", "serkan@gmail.com", "986464");
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new ConfirmationEmailManager());
		userManager.register(user);
		userManager.login(user, false);
		UserManager userManager2 = new UserManager(new HibernateUserDao(), new GoogleLoginManagerAdapter());
		userManager2.login(user1, true);
	}

}
