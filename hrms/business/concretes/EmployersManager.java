package hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.business.abstracst.EmployersService;
import hrms.core.utilities.Results.Resultss;
import hrms.core.utilities.SuccesResults.SuccessResult;
import hrms.dataacces.abstracts.EmployersDao;
import hrms.entities.concretes.Employees;
import hrms.entities.concretes.Employers;

public class EmployersManager implements EmployersService{
	
private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}
	
    

	@Override
	public List<Employers> getAll() {
		
		return this.employersDao.findAll();
	}



	@Override
	public Resultss add(Employers employers) {
		
			this.employersDao.save(employers);
			return new SuccessResult("ürün eklendi");
		}
	}
	

	
	
