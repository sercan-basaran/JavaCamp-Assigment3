package eTicaret.core;

public class ConfirmationEmailManager {
	public void sendEMail(String eMail) {
		System.out.println("Doğrulama linki " +eMail + " adresine gönderildi.");
	}
	
	public boolean checkConfirmation() {
		return true;
	}
}