package hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.business.abstracst.EmployeesService;
import hrms.core.utilities.DataResults.DataResults;
import hrms.core.utilities.Results.Resultss;
import hrms.core.utilities.SuccesDataResults.SuccessDataResults;
import hrms.core.utilities.SuccesResults.SuccessResult;
import hrms.dataacces.abstracts.EmployeesDao;
import hrms.entities.concretes.Employees;

public class EmployeesManager implements EmployeesService{
	
	private EmployeesDao employeesDao;
	
	@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		
		super();
		this.employeesDao = employeesDao;
	}
	


	@Override
	public DataResults<List<Employees>> getAll() {
		
		return new SuccessDataResults<List<Employees>> 
		(this.employeesDao.findAll(),"data listelendi");
		
	}



	@Override
	public Resultss add(Employees employees) {
		this.employeesDao.save(employees);
		return new SuccessResult("ürün eklendi");
	}

}
