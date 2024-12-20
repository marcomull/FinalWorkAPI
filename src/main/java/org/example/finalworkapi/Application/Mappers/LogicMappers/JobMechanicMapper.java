package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.JobDTO.AddJobDTO;
import org.example.finalworkapi.Application.DTOs.JobDTO.ListJobDTO;
import org.example.finalworkapi.Domain.Entities.*;
import org.springframework.stereotype.Component;

@Component
public class JobMechanicMapper {

    //List job mechanic
    public ListJobDTO toDTO(Job job) {
        ListJobDTO dto = new ListJobDTO();
        dto.setIdJob(job.getIdJob());
        dto.setIdMaintenance(job.getIdMaintenance().getIdMaintenance());
        dto.setDescription(job.getIdMaintenance().getDescriptions());
        dto.setStartMaintenance(job.getStartMaintenance());
        dto.setEndMaintenance(job.getEndMaintenance());
        return dto;
    }

    //Add job mechanic
    public Job toEntity(AddJobDTO dto) {
        Job job = new Job();
        job.setIdMaintenance(new Maintenance(dto.getIdMaintenance()));
        job.setIdMechanic(new Mechanic(dto.getIdMechanic()));
        job.setStartMaintenance(dto.getStartMaintenance());
        job.setEndMaintenance(dto.getEndMaintenance());
        return job;
    }

}
