package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.SparePartAppService;
import org.example.finalworkapi.Application.DTOs.SparePartDTO.SparePartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
}
