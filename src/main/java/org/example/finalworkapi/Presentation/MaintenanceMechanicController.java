package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.MaintenanceAppServiceMechanic;
import org.example.finalworkapi.Application.DTOs.MaintenanceMechanicDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/maintenance/mechanic")
public class MaintenanceMechanicController {

    @Autowired
    private MaintenanceAppServiceMechanic maintenanceApplicationService;

    public MaintenanceMechanicController(MaintenanceAppServiceMechanic maintenanceApplicationService) {
        this.maintenanceApplicationService = maintenanceApplicationService;
    }

    @GetMapping
    public ResponseEntity<List<MaintenanceMechanicDTO>> getMaintenanceMechanic() {

        List<MaintenanceMechanicDTO> details = maintenanceApplicationService.getAllMaintenanceMechanic();
        return ResponseEntity.ok(details);

    }

}