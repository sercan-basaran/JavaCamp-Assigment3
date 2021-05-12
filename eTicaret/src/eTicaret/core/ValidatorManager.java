package eTicaret.core;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorManager {
	public static boolean validatePassword(String password) {
		if (password.length() < 6) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean validateEMail(String eMail) {
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(eMail);
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean validateNameLenght(String firstName, String lastName) {
		if(firstName.length()<2 || lastName.length()<2) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isUsedEMail(List<String> eMailList, String searchedEMail) {
		boolean isUsed=false;
		for (String eMail : eMailList) {
			if(searchedEMail==eMail) {
				isUsed=true;
			}			
		}
		return isUsed;
	}
}