package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.MaintenanceDTO;
import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MaintenanceMapper {

    public MaintenanceDTO toDTO(Object[] maintenanceData) {
        MaintenanceDTO dto = new MaintenanceDTO();
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

    // Si necesitas mapear de DTO a entidad, puedes agregar otro método
    //public Maintenance toEntity(MaintenanceDTO dto) {
        // Implementación inversa si es necesario
    //}

}
