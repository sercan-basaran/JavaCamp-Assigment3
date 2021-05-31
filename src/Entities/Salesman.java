package Entities;

public class Salesman {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityNumber;
	
	public  Salesman () {
		
	}

	public Salesman(int id, String firstName, String lastName, String nationalityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityNumber = nationalityNumber;
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

	public String getNationalityNumber() {
		return nationalityNumber;
	}

	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
	
	

	
}
