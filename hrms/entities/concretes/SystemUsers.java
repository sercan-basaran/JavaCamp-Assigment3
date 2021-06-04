package hrms.entities.concretes;




import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Entity
@Data

@Table(name="system_users")

@AllArgsConstructor
@NoArgsConstructor
public class SystemUsers{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="national_id")
	private String nationalId;
}
	

