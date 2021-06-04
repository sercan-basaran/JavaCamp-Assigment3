package hrms.core.utilities.SuccesDataResults;

import hrms.core.utilities.DataResults.DataResults;

public class SuccessDataResults<T> extends DataResults<T>{

	public SuccessDataResults(T data, String message) {
		super(data, true, message);
	}
	
	public SuccessDataResults(T data) {
		super(data, true);
	}
	
	public SuccessDataResults(String message) {
		super(null, true, message);
	}
	
	public SuccessDataResults() {
		super(null, true);
	}

}
