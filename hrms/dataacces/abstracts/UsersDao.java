package hrms.dataacces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import hrms.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users,Integer> {
	 Users findByEmail(String email);

	    Users findByEmailAndEmailVerifyCode(String email, String emailVerifyCode);

}
