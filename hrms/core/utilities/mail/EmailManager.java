package hrms.core.utilities.mail;

import org.springframework.stereotype.Service;

import hrms.core.utilities.Results.Resultss;
import hrms.core.utilities.SuccesResults.SuccessResult;

@Service
public class EmailManager implements EmailService{

	@Override
	public Resultss send(String to, String title, String message) {
		   return new SuccessResult("E-posta başarıyla gönderildi.");
	}

}
