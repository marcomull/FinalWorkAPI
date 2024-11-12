package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.JobAppServiceMechanic;
import org.example.finalworkapi.Application.DTOs.MechanicDTO.JobMechanicDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
public class JobMechanicController {

    @Autowired
    private JobAppServiceMechanic appServiceJob;

    public JobMechanicController(JobAppServiceMechanic appServiceJob) {
        this.appServiceJob = appServiceJob;
    }

    @GetMapping("/jobMechanic")
    public ResponseEntity<List<JobMechanicDTO>> getAllJobs() {
        List<JobMechanicDTO> details = appServiceJob.getAllJobs();
        return ResponseEntity.ok(details);
    }

    /*@PostMapping("/createJob")
    public ResponseEntity<JobMechanicDTO> createJob(@RequestBody JobMechanicDTO jobMechanicDTO) {
        JobMechanicDTO createdJob = appServiceJob.createJob(jobMechanicDTO);
        return ResponseEntity.ok(createdJob);
    }*/
}
