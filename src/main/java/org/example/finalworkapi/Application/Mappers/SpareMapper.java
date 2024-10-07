package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.JobDTO;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class SpareMapper {

    public JobDTO toDTO(Object[] maintenanceData) {
        JobDTO dto = new JobDTO();
        dto.setIdJob((Integer) maintenanceData[0]);
        dto.setStartMaintenance((Date) maintenanceData[1]);
        dto.setSparePart((String) maintenanceData[2]);
        dto.setEndMaintenance((Date) maintenanceData[3]);
        return dto;
    }

}
