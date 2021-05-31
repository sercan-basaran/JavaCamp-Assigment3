package Entities;
import java.util.Date;

public class Player {
	
	private int Id;
	private String firstName;
	private String lastName;
	private String nickName;
	private String nationalityNumber;
	private Date   birthDay;
	

	public Player () {
		
	}


	public Player(int id, String firstName, String lastName, String nickName, String nationalityNumber, Date birthDay) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.nationalityNumber = nationalityNumber;
		this.birthDay = birthDay;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
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


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getNationalityNumber() {
		return nationalityNumber;
	}


	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	
	
	
	
	
	
	
}
