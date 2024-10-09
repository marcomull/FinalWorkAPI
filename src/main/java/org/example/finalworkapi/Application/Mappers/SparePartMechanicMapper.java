package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.JobMechanicDTO;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class SparePartMechanicMapper {

    public JobMechanicDTO toDTO(Object[] maintenanceData) {
        JobMechanicDTO dto = new JobMechanicDTO();
        dto.setIdJob((Integer) maintenanceData[0]);
        dto.setStartMaintenance((Date) maintenanceData[1]);
        dto.setSparePart((String) maintenanceData[2]);
        dto.setEndMaintenance((Date) maintenanceData[3]);
        return dto;
    }

}
