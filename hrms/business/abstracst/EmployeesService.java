package hrms.business.abstracst;

import java.util.List;

import hrms.core.utilities.DataResults.DataResults;
import hrms.core.utilities.Results.Resultss;
import hrms.entities.concretes.Employees;

public interface EmployeesService {

	DataResults<List<Employees>> getAll();
	Resultss add(Employees employees);
}
