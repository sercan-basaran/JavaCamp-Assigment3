package hrms.core.utilities.mail;

import hrms.core.utilities.Results.Resultss;

public interface EmailService {
    Resultss send(String to, String title, String message);
}