package hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.business.abstracst.JobService;
import hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("api/job_positions")
public class JobControllers {

	private JobService jobService;
	
	
	@Autowired
	public  JobControllers(JobService jobService) {
		super();
		this.jobService = jobService;
	}


	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobService.getAll();
	}
}
