package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.DTOs.VehicleDTO.VehicleDTO;
import org.example.finalworkapi.Application.ApplicationServices.VehicleAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleAppService vehicleAppService;

    @Autowired
    public VehicleController(VehicleAppService vehicleAppService) {
        this.vehicleAppService = vehicleAppService;
    }

    @GetMapping("/listVehicles")
    public List<VehicleDTO> getAllVehicles() {
        return vehicleAppService.getAllVehicle();
    }
}

