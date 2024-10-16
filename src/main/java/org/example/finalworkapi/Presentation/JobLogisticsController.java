package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.JobAppServiceLogistics;
import org.example.finalworkapi.Application.DTOs.JobLogisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/maintenance/jobLogistic")
public class JobLogisticsController {

    @Autowired
    private JobAppServiceLogistics appServiceJob;

    public JobLogisticsController(JobAppServiceLogistics appServiceJob) {
        this.appServiceJob = appServiceJob;
    }

    @GetMapping
    public ResponseEntity<List<JobLogisticsDTO>> getAllJobs() {

        List<JobLogisticsDTO> details = appServiceJob.getAllJobsLogistics();
        return ResponseEntity.ok(details);

    }

}
