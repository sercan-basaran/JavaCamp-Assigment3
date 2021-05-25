package casper.hrmsApp.src.main.java.casper.hrmsApp.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import casper.hrmsApp.src.main.java.casper.hrmsApp.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
