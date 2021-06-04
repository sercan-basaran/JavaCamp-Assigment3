package hrms.dataacces.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.JobPosition;

public interface JobDao extends JpaRepository<JobPosition,Integer> {

	 JobPosition findByPositionName(String positionName);
}
