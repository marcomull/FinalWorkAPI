package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.MaintenanceAdministratorDTO;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class MaintenanceAdministratorMapper {

    public MaintenanceAdministratorDTO toDTO(Object[] maintenanceData) {
        MaintenanceAdministratorDTO dto = new MaintenanceAdministratorDTO();
        dto.setIdMaintenance((Integer) maintenanceData[0]);
        dto.setMileage((Integer) maintenanceData[1]);
        dto.setPlate((String) maintenanceData[2]);
        dto.setBrand((String) maintenanceData[3]);
        dto.setModel((String) maintenanceData[4]);
        dto.setYearManufacture((Date) maintenanceData[5]);
        dto.setMaintenancePlan((String) maintenanceData[6]);
        dto.setNameType((String) maintenanceData[7]);
        dto.setDescriptionReport((String) maintenanceData[8]);
        dto.setDateMaintenance((Date) maintenanceData[9]);
        dto.setDescriptions((String) maintenanceData[10]);
        return dto;
    }
}
