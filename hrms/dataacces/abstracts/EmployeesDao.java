package hrms.dataacces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees,Integer>{

	   Employees findByNationalityId(String nationalityId);
}
