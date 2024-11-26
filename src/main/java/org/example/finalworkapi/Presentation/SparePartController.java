package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.SparePartAppService;
import org.example.finalworkapi.Application.DTOs.SparePartDTO.SparePartDTO;
import org.example.finalworkapi.Domain.Entities.SparePart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sparePart")
public class SparePartController {

    private final SparePartAppService sparePartAppService;

    @Autowired
    public SparePartController(SparePartAppService sparePartAppService) {
        this.sparePartAppService = sparePartAppService;
    }

    //List spare part repuesto
    @GetMapping("/listSparePart")
    public ResponseEntity<List<SparePartDTO>> getMaintenanceDetails() {
        try {
            List<SparePartDTO> details = sparePartAppService.getAllSparePart();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    //Add request spare part
    @PostMapping("/addSparePart")
    public ResponseEntity<String> addSparePart(@RequestBody SparePartDTO sSparePartDTO) {
        try {
            SparePart savedSparePart = sparePartAppService.addSeparePart(sSparePartDTO);
            return ResponseEntity.ok("Registro solicitud repuesto agregado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    //Update repuesto
    @PutMapping("/updateSparePart/{id}")
    public ResponseEntity<String> updateSparePart(
            @PathVariable int id,
            @RequestBody SparePartDTO sparePartDTO) {
        try {
            Optional<SparePart> updatedMaintenance = sparePartAppService.updateSparePart(id, sparePartDTO);
            return ResponseEntity.ok("Repuesto actualizado exitosamente: ");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // Get maintenance by ID
    @GetMapping("/{id}")
    public ResponseEntity<SparePartDTO> getSparePartById(@PathVariable int id) {
        try {
            Optional<SparePartDTO> sparePart = sparePartAppService.getSparePartById(id);

            if (sparePart.isPresent()) {
                return ResponseEntity.ok(sparePart.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // Delete maintenance
    @DeleteMapping("/deleteSparePart/{id}")
    public ResponseEntity<String> deleteSparePart(@PathVariable int id) {
        try {
            SparePartDTO deleteDTO = new SparePartDTO();
            deleteDTO.setIdSparePart(id);
            boolean isDeleted = sparePartAppService.deleteSparePart(deleteDTO);
            return ResponseEntity.ok("Mantenimiento eliminado exitosamente con ID: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
