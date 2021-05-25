package casper.hrmsApp.src.main.java.casper.hrmsApp.business.abstracts;



import java.util.List;

import casper.hrmsApp.src.main.java.casper.hrmsApp.entities.concretes.JobPosition;

public interface JobPositionService {
    List<JobPosition> getAll();
}
