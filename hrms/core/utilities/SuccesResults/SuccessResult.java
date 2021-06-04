package hrms.core.utilities.SuccesResults;

import hrms.core.utilities.Results.Resultss;

public class SuccessResult extends Resultss{
	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
	}
}
