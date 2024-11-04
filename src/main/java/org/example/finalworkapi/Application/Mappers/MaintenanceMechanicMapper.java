package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.MechanicDTO.MaintenanceMechanicDTO;
import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.springframework.stereotype.Component;

@Component
public class MaintenanceMechanicMapper {

    //List maintenance
    public MaintenanceMechanicDTO toDTO(Maintenance maintenance) {
        MaintenanceMechanicDTO dto = new MaintenanceMechanicDTO();
        dto.setIdMaintenance(maintenance.getIdMaintenance());
        dto.setMileage(maintenance.getVehicle().getMileage());
        dto.setPlate(maintenance.getVehicle().getPlate());
        dto.setBrand(maintenance.getVehicle().getBrand());
        dto.setModel(maintenance.getVehicle().getModel());
        dto.setYearManufacture(maintenance.getVehicle().getYearManufacture());
        dto.setMaintenancePlan(maintenance.getVehicle().getMaintenancePlan());
        return dto;
    }

}
