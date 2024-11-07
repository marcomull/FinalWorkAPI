package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.TypeMaintenanceAppService;
import org.example.finalworkapi.Application.ApplicationServices.VehicleAppService;
import org.example.finalworkapi.Application.DTOs.TypeMaintenanceDTO.ListTypeMaintenanceDTO;
import org.example.finalworkapi.Application.DTOs.VehicleDTO.VehicleDTO;
import org.example.finalworkapi.Domain.Entities.TypeMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typeMaintenance")
public class TypeMaintenanceController {
    private final TypeMaintenanceAppService typeMaintenanceAppService;

    @Autowired
    public TypeMaintenanceController(TypeMaintenanceAppService typeMaintenanceAppService) {
        this.typeMaintenanceAppService = typeMaintenanceAppService;
    }

    @GetMapping("/listMaintenance")
    public List<ListTypeMaintenanceDTO> getAllTypeMaintenances() {
        return typeMaintenanceAppService.getAllTypeMaintenances();
    }
}