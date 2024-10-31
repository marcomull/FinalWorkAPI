package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.MaintenanceAppServiceAdministrator;
import org.example.finalworkapi.Application.DTOs.AddMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.ListMaintenanceAdminDTO;
import org.example.finalworkapi.Domain.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceAdministratorController {

    @Autowired
    private MaintenanceAppServiceAdministrator maintenanceApplicationService;

    public MaintenanceAdministratorController(MaintenanceAppServiceAdministrator maintenanceApplicationService) {
        this.maintenanceApplicationService = maintenanceApplicationService;
    }

    @GetMapping("/administrator")
    public ResponseEntity<List<ListMaintenanceAdminDTO>> getMaintenanceDetails() {

        List<ListMaintenanceAdminDTO> details = maintenanceApplicationService.getAllMaintenanceDetails();
        return ResponseEntity.ok(details);

    }

    @PostMapping("/add")
    public ResponseEntity<String> addMaintenance(@RequestBody AddMaintenanceAdminDTO addMaintenanceAdminDTO) {
        try {
            Maintenance savedMaintenance = maintenanceApplicationService.addMaintenance(addMaintenanceAdminDTO);
            return ResponseEntity.ok("Registro de mantenimiento agregado exitosamente" + savedMaintenance.getIdMaintenance());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro de mantenimiento: " + e.getMessage());
        }
    }

}
