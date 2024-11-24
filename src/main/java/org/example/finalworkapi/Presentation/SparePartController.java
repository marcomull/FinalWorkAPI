package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.SparePartAppServiceJob;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Application.DTOs.RequestSparePartDTO.AddSparePartDTO;
import org.example.finalworkapi.Application.DTOs.RequestSparePartDTO.ListSparePartDTO;
import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.example.finalworkapi.Domain.Entities.SparePart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sparePart")
public class SparePartController {

    private final SparePartAppServiceJob sparePartAppServiceJob;

    @Autowired
    public SparePartController(SparePartAppServiceJob sparePartAppServiceJob) {
        this.sparePartAppServiceJob = sparePartAppServiceJob;
    }

    //List maintenance
    @GetMapping("/listSparePart")
    public ResponseEntity<List<ListSparePartDTO>> getMaintenanceDetails() {
        try {
            List<ListSparePartDTO> details = sparePartAppServiceJob.getAllSpareParts();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    //Add request spare part
    @PostMapping("/addRequest")
    public ResponseEntity<String> addRequestSparePart(@RequestBody AddSparePartDTO sparePartDTO) {
        try {
            SparePart savedRequestSparePart = sparePartAppServiceJob.addRequestSparePart(sparePartDTO);
            return ResponseEntity.ok("Registro solicitud repuesto agregado exitosamente" + savedRequestSparePart.getIdSparePart());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro solicitud repuesto: " + e.getMessage());
        }
    }
}
