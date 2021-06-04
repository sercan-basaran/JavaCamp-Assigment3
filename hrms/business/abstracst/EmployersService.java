package hrms.business.abstracst;

import java.util.List;

import hrms.core.utilities.Results.Resultss;
import hrms.entities.concretes.Employers;

public interface EmployersService {

	List<Employers> getAll();

	Resultss add(Employers employers);

	
}
