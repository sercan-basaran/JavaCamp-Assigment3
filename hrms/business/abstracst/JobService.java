package hrms.business.abstracst;

import java.util.List;

import hrms.entities.concretes.JobPosition;

public interface JobService {

	List<JobPosition> getAll();

}
