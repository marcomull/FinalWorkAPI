package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.JobAppServiceMechanic;
import org.example.finalworkapi.Application.DTOs.JobMechanicDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/maintenance/jobMechanic")
public class JobMechanicController {

    @Autowired
    private JobAppServiceMechanic appServiceJob;

    public JobMechanicController(JobAppServiceMechanic appServiceJob) {
        this.appServiceJob = appServiceJob;
    }

    @GetMapping
    public ResponseEntity<List<JobMechanicDTO>> getAllJobs() {
        try {
            List<JobMechanicDTO> details = appServiceJob.getAllJobs();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            System.err.println("Error al obtener los detalles de mantenimiento: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
