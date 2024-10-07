package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.MaintenanceAppServiceAdministrator;
import org.example.finalworkapi.Application.DTOs.MaintenanceAdministratorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/maintenance/administrator")
public class MaintenanceAdministratorController {

    @Autowired
    private MaintenanceAppServiceAdministrator maintenanceApplicationService;

    public MaintenanceAdministratorController(MaintenanceAppServiceAdministrator maintenanceApplicationService) {
        this.maintenanceApplicationService = maintenanceApplicationService;
    }

    @GetMapping
    public ResponseEntity<List<MaintenanceAdministratorDTO>> getMaintenanceDetails() {
        try {
            List<MaintenanceAdministratorDTO> details = maintenanceApplicationService.getAllMaintenanceDetails();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            System.err.println("Error al obtener los detalles de mantenimiento: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
