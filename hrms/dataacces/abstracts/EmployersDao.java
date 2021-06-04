package hrms.dataacces.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.Employers;


public interface EmployersDao extends JpaRepository<Employers,Integer>{


}
