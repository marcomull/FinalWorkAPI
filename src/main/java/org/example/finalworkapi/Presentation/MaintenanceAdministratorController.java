package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.MaintenanceAppServiceAdministrator;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.AddMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.ListMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.UpdateMaintenanceDTO;
import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceAdministratorController {

    private static final Logger logger = LoggerFactory.getLogger(MaintenanceAdministratorController.class);

    @Autowired
    private MaintenanceAppServiceAdministrator maintenanceApplicationService;

    public MaintenanceAdministratorController(MaintenanceAppServiceAdministrator maintenanceApplicationService) {
        this.maintenanceApplicationService = maintenanceApplicationService;
    }

    //List maintenance
    @GetMapping("/administrator")
    public ResponseEntity<List<ListMaintenanceAdminDTO>> getMaintenanceDetails() {
        try {
            List<ListMaintenanceAdminDTO> details = maintenanceApplicationService.getAllMaintenanceDetails();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            logger.error("Error retrieving maintenance details: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    //Add maintenance
    @PostMapping("/add")
    public ResponseEntity<String> addMaintenance(@RequestBody AddMaintenanceAdminDTO addMaintenanceAdminDTO) {
        try {
            Maintenance savedMaintenance = maintenanceApplicationService.addMaintenance(addMaintenanceAdminDTO);
            return ResponseEntity.ok("Registro de mantenimiento agregado exitosamente" + savedMaintenance.getIdMaintenance());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro de mantenimiento: " + e.getMessage());
        }
    }

    // Update maintenance
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateMaintenance(
            @PathVariable int id,
            @RequestBody UpdateMaintenanceDTO updateDTO) {
        try {
            Optional<Maintenance> updatedMaintenance = maintenanceApplicationService.updateMaintenance(id, updateDTO);

            if (updatedMaintenance.isPresent()) {
                return ResponseEntity.ok("Mantenimiento actualizado exitosamente: " + updatedMaintenance.get().getIdMaintenance());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Mantenimiento no encontrado con ID: " + id);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el mantenimiento: " + e.getMessage());
        }
    }

    // Delete maintenance
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMaintenance(@PathVariable int id) {
        try {
            ListMaintenanceAdminDTO deleteDTO = new ListMaintenanceAdminDTO();
            deleteDTO.setIdMaintenance(id);
            boolean isDeleted = maintenanceApplicationService.deleteMaintenance(deleteDTO);
            if (isDeleted) {
                return ResponseEntity.ok("Mantenimiento eliminado exitosamente con ID: " + id);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Mantenimiento no encontrado con ID: " + id);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el mantenimiento: " + e.getMessage());
        }
    }

    //Search mantenimiento
    @GetMapping("/search")
    public ResponseEntity<List<ListMaintenanceAdminDTO>> searchMaintenance(
            @RequestParam("type") String searchType,
            @RequestParam("value") String searchValue) {

        logger.info("Searching maintenance with type: {} and value: {}", searchType, searchValue);

        if (!isValidSearchType(searchType)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        try {
            List<ListMaintenanceAdminDTO> result = maintenanceApplicationService.searchMaintenance(searchType, searchValue);
            return result.isEmpty()
                    ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                    : new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error performing search: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // Método para validar los tipos de búsqueda
    private boolean isValidSearchType(String searchType) {
        return searchType.equals("maintenanceId") ||
                searchType.equals("failureReportId") ||
                searchType.equals("vehicleId") ||
                searchType.equals("administratorId") ||
                searchType.equals("typeMaintenanceId");
    }

    // Get maintenance by ID
    @GetMapping("/{id}")
    public ResponseEntity<ListMaintenanceAdminDTO> getMaintenanceById(@PathVariable int id) {
        try {
            Optional<ListMaintenanceAdminDTO> maintenance = maintenanceApplicationService.getMaintenanceById(id);

            if (maintenance.isPresent()) {
                return ResponseEntity.ok(maintenance.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (Exception e) {
            logger.error("Error retrieving maintenance by ID: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
