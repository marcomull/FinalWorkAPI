package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.VehicleDTO.VehicleDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.VehicleMapper;
import org.example.finalworkapi.Domain.Entities.Vehicle;
import org.example.finalworkapi.Domain.InterfaceService.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleAppService {

    private final IVehicleService vehicleService;
    private final VehicleMapper vehicleMapper;

    @Autowired
    public VehicleAppService(IVehicleService vehicleService, VehicleMapper vehicleMapper) {
        this.vehicleService = vehicleService;
        this.vehicleMapper = vehicleMapper;
    }

    //List vehicle
    public List<VehicleDTO> getAllVehicle() {
        List<Vehicle> vehicleList = vehicleService.getAllVehicle();
        try {
            return vehicleList.stream()
                    .map(vehicleMapper::toDTO)
                    .collect(Collectors.toList());
        } catch (ClassCastException e) {
            return Collections.emptyList();
        }
    }
}
