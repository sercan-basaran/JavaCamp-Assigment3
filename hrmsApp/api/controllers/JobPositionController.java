package casper.hrmsApp.src.main.java.casper.hrmsApp.api.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import casper.hrmsApp.src.main.java.casper.hrmsApp.business.abstracts.JobPositionService;
import casper.hrmsApp.src.main.java.casper.hrmsApp.entities.concretes.JobPosition;

import java.util.List;

@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {
    private final JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
    public List<JobPosition> getAll(){
        return jobPositionService.getAll();
    }
}
