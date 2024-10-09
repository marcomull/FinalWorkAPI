package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.JobLogisticsDTO;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class SparePartLogisticsMapper {
    public JobLogisticsDTO toDTO(Object[] maintenanceData) {
        JobLogisticsDTO dto = new JobLogisticsDTO();
        dto.setIdSparePart((Integer) maintenanceData[0]);
        dto.setStartMaintenance((Date) maintenanceData[1]);
        dto.setSparePart((String) maintenanceData[2]);
        dto.setMechanic((Integer) maintenanceData[3]);
        return dto;
    }
}
