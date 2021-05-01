package odev;



public class Student extends User {
	
	 private String studentNumber;
	 private String courseDetails;
	 private String CustomerAccount;
	 private String password;
	 
	 public Student(String studentNumber, String courseDetails,String CustomerAccount) {
		super();
		this.studentNumber = studentNumber;
		this.courseDetails = courseDetails;
		this.CustomerAccount = CustomerAccount;
	}
	  
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	public String getCustomerAccount() {
		return CustomerAccount;
	}

	public void setCustomerAccount(String customerAccount) {
		CustomerAccount = customerAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(int i) {
		this.password = password;
		
		
	}


}