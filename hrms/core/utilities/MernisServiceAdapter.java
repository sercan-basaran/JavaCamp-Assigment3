package hrms.core.utilities;

import org.springframework.stereotype.Service;

import hrms.core.utilities.Results.Resultss;
import hrms.core.utilities.SuccesResults.SuccessResult;

@Service
public class MernisServiceAdapter implements IdentityValidationService {
    @Override
    public Resultss validate(String tckn, String firstName, String lastName, int yearOfDate) {
        return new SuccessResult("TCKN doğrulaması başarılı.");
    }
}