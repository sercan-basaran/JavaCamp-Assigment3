package odev;

public class User {
	
	  private  int id;
	  private String customerNumber;
	  private String firstName;
	  private String lastName;
	  private String courseDetails;
	  private String password;

	public User(String customerNumber, String courseDetails) {
		
		super();
		this.customerNumber = customerNumber;
		this.courseDetails = courseDetails;
		
	}

	



	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getCourseDetails() {
		return courseDetails;
	}



	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}





	public String getCustomerNumber() {
		return customerNumber;
	}





	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}





	
}