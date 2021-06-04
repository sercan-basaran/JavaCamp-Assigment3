package hrms.core.utilities.DataResults;

import kodlamaio.hrms.core.utilities.results.Result;

public class DataResults<T> extends Result{

	private T data;
	
	public DataResults(T data, boolean success, String message) {
		super(success, message);
		this.data=data;
	}
	
	public DataResults(T data, boolean success) {
		super(success);
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}
}
