package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Domain.DomainServices.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/maintenance/details")
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @GetMapping
    public ResponseEntity<List<Object[]>> getMaintenanceDetails() {
        try {
            List<Object[]> details = maintenanceService.getAllMaintenanceDetails();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            // Registrar el error
            System.err.println("Error al obtener los detalles de mantenimiento: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
