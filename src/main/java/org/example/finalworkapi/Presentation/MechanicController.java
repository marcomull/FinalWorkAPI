package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.MechanicAppService;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MechanicController {

    private final MechanicAppService mechanicAppService;

    @Autowired
    public MechanicController(MechanicAppService mechanicAppService) {
        this.mechanicAppService = mechanicAppService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMechanic(@RequestBody LoginDTO mechanic) {
        try {
            Mechanic savedMechanic = mechanicAppService.addMechanic(mechanic);
            return ResponseEntity.ok("Registro de mecanico agregado exitosamente" + savedMechanic.getEmail());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro de mecanico: " + e.getMessage());
        }
    }
}
