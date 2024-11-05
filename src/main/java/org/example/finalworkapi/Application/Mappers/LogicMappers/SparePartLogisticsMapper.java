package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.LogisticsDTO.JobLogisticsDTO;
import org.example.finalworkapi.Domain.Entities.Job;
import org.springframework.stereotype.Component;

@Component
public class SparePartLogisticsMapper {

    //List job
    public JobLogisticsDTO toDTO(Job job) {
        JobLogisticsDTO dto = new JobLogisticsDTO();
        dto.setIdSparePart((job.getIdSparePart().getIdSparePart()));
        dto.setStartMaintenance(job.getStartMaintenance());
        dto.setSparePart(job.getIdSparePart().getSparePart());
        dto.setMechanic(job.getIdMechanic().getIdMechanic());
        return dto;
    }
}
