package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.AdministratorAppService;
import org.example.finalworkapi.Application.DTOs.AdministratorDTO.ListAdministratorDTO;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Domain.Entities.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    private final AdministratorAppService administratorAppService;

    @Autowired
    public AdministratorController(AdministratorAppService administratorAppService) {
        this.administratorAppService = administratorAppService;
    }

    @GetMapping("/listAdministrator")
    public List<ListAdministratorDTO> getAdministrator() {
        return administratorAppService.getAllAdministrator();
    }

    //Add administrator
    @PostMapping("/add")
    public ResponseEntity<String> addAdministrator(@RequestBody LoginDTO addAdministratorDTO) {
        try {
            Administrator savedMaintenance = administratorAppService.addAdministrator(addAdministratorDTO);
            return ResponseEntity.ok("Registro de administrador agregado exitosamente" + savedMaintenance.getEmail());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro de administrador: " + e.getMessage());
        }
    }
}
