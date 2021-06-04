package hrms.core.utilities;

import hrms.core.utilities.Results.Resultss;

public interface IdentityValidationService {
    Resultss validate(String tckn, String firstName, String lastName, int yearOfDate);
}