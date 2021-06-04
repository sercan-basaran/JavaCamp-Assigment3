package hrms.core.utilities.business;

import hrms.core.utilities.Results.Resultss;

public class BusinessRules {
    public static Resultss run(Resultss... logics) {
        for (Resultss result : logics) {
            if (!result.isSuccess()) {
                return result;
            }
        }
        return null;
    }
}