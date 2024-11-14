package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.MaintenanceAppServiceMechanic;
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

    @PutMapping("/finalize/{id}")
    public MaintenanceMechanicDTO finalizeMaintenance(@PathVariable("id") int id) {
        try {
            return maintenanceApplicationService.finalizeMaintenance(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}