package eTicaret.core;

import eTicaret.googleLogin.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements LoginService {

	@Override
	public void login(String eMail, String password) {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.loginWithGoogle(eMail, password);
		
	}

}