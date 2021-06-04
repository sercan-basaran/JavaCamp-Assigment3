package hrms.core.utilities.ErrorResults;

import hrms.core.utilities.Results.Resultss;

public class ErrorResults extends Resultss{
	public ErrorResults() {
		super(false);
	}
	
	public ErrorResults(String message) {
		super(false,message);
	}
}
