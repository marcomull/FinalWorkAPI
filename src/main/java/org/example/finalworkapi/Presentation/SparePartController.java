package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.SparePartAppServiceJob;
import org.example.finalworkapi.Application.DTOs.SparePartDTO.ListSparePartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping("/list")
    public ResponseEntity<List<ListSparePartDTO>> getMaintenanceDetails() {
        try {
            List<ListSparePartDTO> details = sparePartAppServiceJob.getAllSpareParts();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
