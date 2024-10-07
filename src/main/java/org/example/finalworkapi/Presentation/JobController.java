package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.AppServiceJob;
import org.example.finalworkapi.Application.DTOs.JobDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/maintenance/job")
public class JobController {

    @Autowired
    private AppServiceJob appServiceJob;

    public JobController(AppServiceJob appServiceJob) {
        this.appServiceJob = appServiceJob;
    }

    @GetMapping
    public ResponseEntity<List<JobDTO>> getAllJobs() {
        try {
            List<JobDTO> details = appServiceJob.getAllJobs();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            System.err.println("Error al obtener los detalles de mantenimiento: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
