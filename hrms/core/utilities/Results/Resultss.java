package hrms.core.utilities.Results;

public class Resultss {
	private boolean success;
	private String message;
	
	public Resultss(boolean success) {
		this.success=success;
	}
	
	public Resultss(boolean success, String message) {
		this(success);
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
}
