package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.LogisticAppService;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Domain.Entities.Logistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

    private final LogisticAppService logisticAppService;

    @Autowired
    public LogisticsController(LogisticAppService logisticAppService) {
        this.logisticAppService = logisticAppService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addLogistics(@RequestBody LoginDTO logistics) {
        try {
            Logistics savedLogistics = logisticAppService.addLogistic(logistics);
            return ResponseEntity.ok("Registro de logistics agregado exitosamente" + savedLogistics.getEmail());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro de logistics: " + e.getMessage());
        }
    }

}
