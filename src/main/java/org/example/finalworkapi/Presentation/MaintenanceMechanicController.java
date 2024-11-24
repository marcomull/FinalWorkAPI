package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.MaintenanceAppServiceMechanic;
import org.example.finalworkapi.Application.DTOs.JobDTO.ListJobDTO;
import org.example.finalworkapi.Application.DTOs.MechanicDTO.MaintenanceMechanicDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceMechanicController {

    @Autowired
    private MaintenanceAppServiceMechanic maintenanceApplicationService;

    public MaintenanceMechanicController(MaintenanceAppServiceMechanic maintenanceApplicationService) {
        this.maintenanceApplicationService = maintenanceApplicationService;
    }

    @GetMapping("/mechanic")
    public ResponseEntity<List<MaintenanceMechanicDTO>> getMaintenanceMechanic() {
        List<MaintenanceMechanicDTO> details = maintenanceApplicationService.getAllMaintenanceMechanic();
        return ResponseEntity.ok(details);
    }

    @PutMapping("/finalizeMaintenance/{id}")
    public ResponseEntity<MaintenanceMechanicDTO> finalizeMaintenance(@PathVariable int id) {
        MaintenanceMechanicDTO finalizedJob = maintenanceApplicationService.finalizeMaintenance(id);
        if (finalizedJob != null) {
            return ResponseEntity.ok(finalizedJob);
        }
        return ResponseEntity.notFound().build();
    }
}