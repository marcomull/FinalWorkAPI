package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.VehicleDTO.VehicleDTO;
import org.example.finalworkapi.Domain.Entities.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class VehicleMapper {

    //List vehicle
    public VehicleDTO toDTO(Vehicle vehicle) {
        VehicleDTO dto = new VehicleDTO();
        dto.setIdVehicle(vehicle.getIdVehicle());
        dto.setModel(vehicle.getModel());
        dto.setBrand(vehicle.getBrand());
        dto.setPlate(vehicle.getPlate());
        return dto;
    }
}
