package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.MechanicDTO.JobMechanicDTO;
import org.example.finalworkapi.Application.DTOs.MechanicDTO.MaintenanceMechanicDTO;
import org.example.finalworkapi.Domain.Entities.Job;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class SparePartMechanicMapper {
    public JobMechanicDTO toDTO(Job job) {
        JobMechanicDTO dto = new JobMechanicDTO();
        dto.setIdJob((job.getIdJob()));
        dto.setStartMaintenance(job.getStartMaintenance());
        dto.setSparePart(job.getIdSparePart().getSparePart());
        dto.setEndMaintenance(job.getEndMaintenance());
        return dto;
    }
}
