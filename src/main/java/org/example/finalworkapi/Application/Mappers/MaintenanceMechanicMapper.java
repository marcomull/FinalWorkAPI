package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.MaintenanceMechanicDTO;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class MaintenanceMechanicMapper {

    public MaintenanceMechanicDTO toDTO(Object[] maintenanceData) {
        MaintenanceMechanicDTO dto = new MaintenanceMechanicDTO();
        dto.setIdMaintenance((Integer) maintenanceData[0]);
        dto.setMileage((Integer) maintenanceData[1]);
        dto.setPlate((String) maintenanceData[2]);
        dto.setBrand((String) maintenanceData[3]);
        dto.setModel((String) maintenanceData[4]);
        dto.setYearManufacture((Date) maintenanceData[5]);
        dto.setMaintenancePlan((String) maintenanceData[6]);
        return dto;
    }

}
