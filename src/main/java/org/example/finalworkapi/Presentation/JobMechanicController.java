package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.JobAppServiceMechanic;
import org.example.finalworkapi.Application.DTOs.JobDTO.AddJobDTO;
import org.example.finalworkapi.Application.DTOs.JobDTO.ListJobDTO;
import org.example.finalworkapi.Domain.Entities.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
public class JobMechanicController {

    private JobAppServiceMechanic appServiceJob;

    @Autowired
    public JobMechanicController(JobAppServiceMechanic appServiceJob) {
        this.appServiceJob = appServiceJob;
    }

    //List job
    @GetMapping("/jobMechanic")
    public ResponseEntity<List<ListJobDTO>> getAllJobs() {
        List<ListJobDTO> details = appServiceJob.getAllJobs();
        return ResponseEntity.ok(details);
    }

    //Add maintenance
    @PostMapping("/addJob")
    public ResponseEntity<String> addJob(@RequestBody AddJobDTO jobMechanicDTO) {
        try {
            Job savedJob = appServiceJob.addJob(jobMechanicDTO);
            return ResponseEntity.ok("Registro de mantenimiento agregado exitosamente" + savedJob.getIdJob());
        } catch (Exception e) {
            e.printStackTrace(); // Para depurar el error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro de mantenimiento: " + e.getMessage());
        }
    }

    //Finalizar trabajo
    @PutMapping("/finalizeJob/{id}")
    public ResponseEntity<ListJobDTO> finalizeJob(@PathVariable int id) {
        ListJobDTO finalizedJob = appServiceJob.finalizeJob(id);
        if (finalizedJob != null) {
            return ResponseEntity.ok(finalizedJob);
        }
        return ResponseEntity.notFound().build();
    }
}
