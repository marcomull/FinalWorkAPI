package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.JobDTO.AddJobDTO;
import org.example.finalworkapi.Application.DTOs.JobDTO.ListJobDTO;
import org.example.finalworkapi.Domain.Entities.*;
import org.springframework.stereotype.Component;

@Component
public class SparePartMechanicMapper {

    //List job
    public ListJobDTO toDTO(Job job) {
        ListJobDTO dto = new ListJobDTO();
        dto.setIdJob(job.getIdJob());
        dto.setIdMaintenance(job.getIdMaintenance().getIdMaintenance());
        dto.setStartMaintenance(job.getStartMaintenance());
        dto.setSparePart(job.getIdSparePart().getSparePart());
        dto.setEndMaintenance(job.getEndMaintenance());
        return dto;
    }

    //Add job
    public Job toEntity(AddJobDTO dto) {
        Job job = new Job();
        job.setIdMaintenance(new Maintenance(dto.getIdMaintenance()));
        job.setIdMechanic(new Mechanic(dto.getIdMechanic()));
        job.setIdSparePart(new SparePart(dto.getIdSparePart()));
        job.setStartMaintenance(dto.getStartMaintenance());
        job.setEndMaintenance(dto.getEndMaintenance());
        return job;
    }

}
