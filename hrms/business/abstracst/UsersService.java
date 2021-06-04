package hrms.business.abstracst;

import java.util.List;


import hrms.entities.concretes.Users;

public interface UsersService {

	List<Users> getAll();
}
