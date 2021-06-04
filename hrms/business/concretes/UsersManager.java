package hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.business.abstracst.UsersService;
import hrms.dataacces.abstracts.UsersDao;

import hrms.entities.concretes.Users;




public class UsersManager implements UsersService{
	
	private UsersDao usersDao;
	
	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}
	
	@Override
	public List<Users> getAll() {
		
		return this.usersDao.findAll();
	}
	


}
